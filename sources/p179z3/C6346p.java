package p179z3;

import android.content.Context;
import android.text.TextUtils;
import p046f4.C4282c;
import p060h4.C4492d3;

/* renamed from: z3.p */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C6346p {
    /* renamed from: a */
    public static void m37348a(Context context) {
        C4492d3.m29601e().mo18029j(context);
    }

    /* renamed from: b */
    public static C6351u m37349b() {
        return C4492d3.m29601e().mo18027b();
    }

    /* renamed from: c */
    public static C6354w m37350c() {
        C4492d3.m29601e();
        String[] split = TextUtils.split("21.3.0", "\\.");
        if (split.length != 3) {
            return new C6354w(0, 0, 0);
        }
        try {
            return new C6354w(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new C6354w(0, 0, 0);
        }
    }

    /* renamed from: d */
    public static void m37351d(Context context, C4282c cVar) {
        C4492d3.m29601e().mo18030k(context, (String) null, cVar);
    }

    /* renamed from: e */
    public static void m37352e(Context context, C6347q qVar) {
        C4492d3.m29601e().mo18033n(context, qVar);
    }

    /* renamed from: f */
    public static void m37353f(Context context, String str) {
        C4492d3.m29601e().mo18034o(context, str);
    }

    /* renamed from: g */
    public static void m37354g(boolean z) {
        C4492d3.m29601e().mo18035p(z);
    }

    /* renamed from: h */
    public static void m37355h(float f) {
        C4492d3.m29601e().mo18036q(f);
    }

    /* renamed from: i */
    public static void m37356i(C6351u uVar) {
        C4492d3.m29601e().mo18037r(uVar);
    }
}
