package com.startapp;

import java.util.List;

/* renamed from: com.startapp.pc */
/* compiled from: Sta */
public class C9227pc {

    /* renamed from: a */
    public List<String> f38083a;

    /* renamed from: b */
    public String f38084b;

    public C9227pc(List<String> list, String str) {
        this.f38083a = list;
        this.f38084b = str;
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("[VideoEvent: tag=");
        a.append(this.f38084b);
        a.append(", fullUrls=");
        a.append(this.f38083a.toString());
        a.append("]");
        return a.toString();
    }
}
