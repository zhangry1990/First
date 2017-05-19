package com.demo.first.view;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;

/**
 * Created by zhangry on 2017/5/19.
 */
public class JsonView extends AbstractView {

    public static final String DEFAULT_CONTENT_TYPE = "application/json";
    public static final String HTML_CONTENT_TYPE = "text/html";
    public static final String DEFAULT_CHAR_ENCODING = "UTF-8";
    private String encoding = "UTF-8";
    private Object jsonData = null;
    public JsonView() {
        this.setContentType("application/json");
    }

    public JsonView(Object data) {
        this.setContentType("application/json");
        this.jsonData = data;
    }

    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding(this.encoding);
        response.setContentType(this.getContentType());
        PrintWriter out = response.getWriter();
        if(this.jsonData == null) {
            out.print("{}");
        } else {
            try {
                String jsonResult = this.renderToJSONString(this.jsonData);
                out.print(jsonResult);
            } catch (Exception var6) {
                response.setStatus(500);
                out.print(var6.getMessage());
            }
        }
    }

    protected String renderToJSONString(Object data) {
        SerializeWriter out = new SerializeWriter((Writer) null, JSON.DEFAULT_GENERATE_FEATURE, new SerializerFeature[]{
                SerializerFeature.QuoteFieldNames,
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.SkipTransientField,
                SerializerFeature.DisableCircularReferenceDetect
        });

        String var4;
        try {
            JSONSerializer serializer = new JSONSerializer(out);
            serializer.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
            serializer.write(data);
            var4 = out.toString();
        } finally {
            out.close();
        }

        return var4;
    }

    public String toString() {
        return this.renderToJSONString(this.jsonData);
    }

}
