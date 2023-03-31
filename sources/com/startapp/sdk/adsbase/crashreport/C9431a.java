package com.startapp.sdk.adsbase.crashreport;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9605vb;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.crashreport.C9432b;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: com.startapp.sdk.adsbase.crashreport.a */
/* compiled from: Sta */
public class C9431a implements C9432b.C9436d {

    /* renamed from: a */
    public final Context f38858a;

    /* renamed from: b */
    public final boolean f38859b;

    /* renamed from: c */
    public final boolean f38860c;

    /* renamed from: d */
    public final boolean f38861d;

    public C9431a(Context context, String str, boolean z, boolean z2, boolean z3) {
        this.f38858a = context;
        this.f38859b = z;
        this.f38860c = z2;
        this.f38861d = z3;
    }

    /* renamed from: a */
    public boolean mo30782a(long j, String str) {
        HashSet hashSet;
        ThreadsState.C9430b bVar = new ThreadsState.C9430b();
        bVar.f38852a = "com.startapp.";
        bVar.f38856e = this.f38859b;
        bVar.f38857f = this.f38860c;
        bVar.f38855d = j;
        bVar.f38853b = str;
        if (this.f38861d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        bVar.f38854c = hashSet;
        ThreadsState threadsState = new ThreadsState(bVar);
        if (threadsState.mo30777d() == null) {
            return false;
        }
        C9673z2.m50591a(this.f38858a, "StartappAnrTrace", (Serializable) threadsState);
        return true;
    }

    public void remove() {
        if (new File(C9673z2.m50597c(this.f38858a, "StartappAnrTrace")).exists()) {
            C9673z2.m50590a(this.f38858a, "StartappAnrTrace");
        }
    }

    /* renamed from: a */
    public void mo30781a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        if (new File(C9673z2.m50597c(this.f38858a, "StartappAnrTrace")).exists() && (threadsState = (ThreadsState) C9673z2.m50588a(this.f38858a, "StartappAnrTrace", ThreadsState.class)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Map<Activity, Integer> map = C9605vb.f39316a;
            PrintWriter printWriter = new PrintWriter(new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true)));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.mo30774b());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.mo30776c())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.mo30776c());
                printWriter.println('\"');
            }
            Map<String, ThreadsState.ShrunkStackTraceElement[]> d = threadsState.mo30777d();
            int i = 0;
            StackTraceElement stackTraceElement = null;
            if (d == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry next : d.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) next.getValue();
                    }
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) next.getValue();
                    printWriter.print('\"');
                    printWriter.print((String) next.getKey());
                    printWriter.println('\"');
                    for (ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement : shrunkStackTraceElementArr2) {
                        if (shrunkStackTraceElement.mo30779a() != 0) {
                            printWriter.print(9);
                            printWriter.println(shrunkStackTraceElement.mo30779a());
                        }
                        StackTraceElement b = shrunkStackTraceElement.mo30780b();
                        if (b != null) {
                            printWriter.print(9);
                            printWriter.print("at ");
                            printWriter.print(b.getClassName());
                            printWriter.print('.');
                            printWriter.print(b.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b.getFileName());
                            printWriter.print(':');
                            printWriter.print(b.getLineNumber());
                            printWriter.println(')');
                        }
                    }
                }
            }
            printWriter.close();
            if (shrunkStackTraceElementArr != null) {
                int length = shrunkStackTraceElementArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement b2 = shrunkStackTraceElementArr[i].mo30780b();
                    if (b2 != null && b2.getClassName().startsWith("com.startapp.")) {
                        stackTraceElement = b2;
                        break;
                    }
                    i++;
                }
                if (stackTraceElement != null) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    C9023i4 i4Var = new C9023i4(C9043j4.f36998i);
                    i4Var.f36952d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
                    i4Var.f36953e = byteArrayOutputStream2;
                    i4Var.mo29471a();
                }
            }
        }
    }
}
