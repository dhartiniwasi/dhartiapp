package com.startapp;

/* renamed from: com.startapp.wb */
/* compiled from: Sta */
public class C9624wb {
    /* renamed from: a */
    public static double m50496a(double d, double d2, double d3) {
        return 1.0d / (Math.exp((d2 - d) * d3) + 1.0d);
    }

    /* renamed from: a */
    public static double m50497a(double d, double d2, double d3, double d4) {
        return (m50496a(d, d2, d3) - d4) / (1.0d - d4);
    }
}
