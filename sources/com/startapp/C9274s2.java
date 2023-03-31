package com.startapp;

/* renamed from: com.startapp.s2 */
/* compiled from: Sta */
public class C9274s2 {

    /* renamed from: a */
    private static final int f38189a = 6371000;

    /* renamed from: a */
    public static double m49254a(double d, double d2, double d3, double d4) {
        double cos = Math.cos(Math.toRadians(d + d3) / 2.0d) * Math.toRadians(d4 - d2);
        double radians = Math.toRadians(d3 - d);
        return Math.sqrt((radians * radians) + (cos * cos)) * 6371000.0d;
    }

    /* renamed from: b */
    public static double m49255b(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = radians / 2.0d;
        double sin = Math.sin(d5);
        double cos = Math.cos(Math.toRadians(d3)) * Math.cos(Math.toRadians(d));
        double d6 = radians2 / 2.0d;
        double sin2 = (Math.sin(d6) * Math.sin(d6) * cos) + (Math.sin(d5) * sin);
        return Math.atan2(Math.sqrt(sin2), Math.sqrt(1.0d - sin2)) * 2.0d * 6371000.0d;
    }
}
