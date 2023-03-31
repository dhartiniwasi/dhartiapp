package com.startapp;

import java.util.regex.Pattern;

/* renamed from: com.startapp.wa */
/* compiled from: Sta */
public class C9623wa {

    /* renamed from: a */
    public final Pattern f39334a = Pattern.compile("\\+");

    /* renamed from: b */
    public final Pattern f39335b = Pattern.compile("/");

    /* renamed from: c */
    public final Pattern f39336c = Pattern.compile("=");

    public C9623wa() {
        Pattern.compile("_");
        Pattern.compile("\\*");
        Pattern.compile("#");
    }

    /* renamed from: a */
    public String mo31350a(String str) {
        return this.f39336c.matcher(this.f39335b.matcher(this.f39334a.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll("#");
    }
}
