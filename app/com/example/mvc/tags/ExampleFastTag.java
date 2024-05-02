package com.example.mvc.tags;

import groovy.lang.Closure;

import java.io.PrintWriter;
import java.util.Map;

import play.templates.FastTags;
import play.templates.GroovyTemplate.ExecutableTemplate;
import play.templates.JavaExtensions;

@FastTags.Namespace("my.tags")
public class ExampleFastTag extends FastTags {
    public static void _hello (Map<?, ?> args, Closure body, PrintWriter out, ExecutableTemplate template, int fromLine) {
        out.print("Hello " + JavaExtensions.toString(body) + "!");
    }

    public static void _howareyou(Map<?, ?> args, Closure body, PrintWriter out, ExecutableTemplate template, int fromLine) {
        out.print("How are you?");
    }
    public static void _verbatim(Map<?, ?> args, Closure body, PrintWriter out, ExecutableTemplate template, int fromLine) {
        out.println("<verbatim>");
        out.println(JavaExtensions.toString(body));
        out.println("</verbatim>");
    }
}
