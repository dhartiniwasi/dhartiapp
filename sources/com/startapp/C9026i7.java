package com.startapp;

/* renamed from: com.startapp.i7 */
/* compiled from: Sta */
public class C9026i7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f36961a;

    /* renamed from: b */
    public final /* synthetic */ String f36962b;

    /* renamed from: c */
    public final /* synthetic */ long f36963c;

    /* renamed from: d */
    public final /* synthetic */ C9000h7 f36964d;

    public C9026i7(C9000h7 h7Var, String str, String str2, long j) {
        this.f36964d = h7Var;
        this.f36961a = str;
        this.f36962b = str2;
        this.f36963c = j;
    }

    public void run() {
        C9000h7 h7Var = this.f36964d;
        String str = this.f36961a;
        String str2 = this.f36962b;
        long j = this.f36963c;
        h7Var.getClass();
        try {
            h7Var.f36901b.mo29519a(str, str2, System.currentTimeMillis(), j);
        } catch (Throwable th) {
            if (h7Var.mo29451a(1)) {
                C9023i4.m48681a(th);
            }
        }
    }
}
