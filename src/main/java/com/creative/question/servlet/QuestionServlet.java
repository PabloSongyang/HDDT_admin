package com.creative.question.servlet;

import com.creative.question.config.ServletConfig;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet({
        "/",
        "/"
})
public class QuestionServlet extends HttpServlet {

    private Gson gson;
    private String str;
    private Map<String, Object> map;

    @Override
    public void init() {
        gson = new Gson();
        map = new HashMap<>();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String AJAX = ServletConfig.getAJAX(request);
        switch (AJAX) {
            case "":

                System.out.println(map);

                out.print(gson.toJson(map));
               break;

        }
    }
}
