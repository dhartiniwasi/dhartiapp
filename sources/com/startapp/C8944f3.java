package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.f3 */
/* compiled from: Sta */
public abstract class C8944f3 {

    /* renamed from: G */
    public Long f36753G;

    /* renamed from: a */
    public Intent f36754a;

    /* renamed from: b */
    public Activity f36755b;

    /* renamed from: c */
    public AdInformationObject f36756c = null;

    /* renamed from: d */
    public BroadcastReceiver f36757d = new C8945a();

    /* renamed from: e */
    public String[] f36758e;

    /* renamed from: f */
    public boolean[] f36759f;

    /* renamed from: g */
    public boolean[] f36760g = {true};

    /* renamed from: h */
    public String f36761h;

    /* renamed from: i */
    public String[] f36762i;

    /* renamed from: j */
    public String[] f36763j;

    /* renamed from: k */
    public String[] f36764k;

    /* renamed from: l */
    public C9381Ad f36765l;

    /* renamed from: m */
    public String f36766m;

    /* renamed from: n */
    public AdPreferences.Placement f36767n;

    /* renamed from: o */
    public AdInformationOverrides f36768o;

    /* renamed from: p */
    public String f36769p;

    /* renamed from: q */
    public Long f36770q;

    /* renamed from: r */
    public Boolean[] f36771r = null;

    /* renamed from: s */
    public int f36772s = 0;

    /* renamed from: t */
    public boolean f36773t = false;

    /* renamed from: u */
    public boolean f36774u = false;

    /* renamed from: com.startapp.f3$a */
    /* compiled from: Sta */
    public class C8945a extends BroadcastReceiver {
        public C8945a() {
        }

        public void onReceive(Context context, Intent intent) {
            C8944f3.this.mo29351b();
        }
    }

    /* renamed from: com.startapp.f3$b */
    /* compiled from: Sta */
    public class C8946b implements Runnable {
        public C8946b() {
        }

        public void run() {
            C8944f3.this.f36755b.finish();
        }
    }

    /* renamed from: a */
    public void mo29348a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo29070a(Bundle bundle);

    /* renamed from: a */
    public boolean mo29350a(int i) {
        boolean[] zArr = this.f36760g;
        if (zArr == null || i < 0 || i >= zArr.length) {
            return true;
        }
        return zArr[i];
    }

    /* renamed from: a */
    public boolean mo29071a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public void mo29351b() {
        this.f36755b.runOnUiThread(new C8946b());
    }

    /* renamed from: b */
    public void mo29072b(Bundle bundle) {
    }

    /* renamed from: c */
    public boolean mo29352c() {
        return false;
    }

    /* renamed from: d */
    public void mo29353d() {
        if (this.f36757d != null) {
            C8846b6.m48400a((Context) this.f36755b).mo29211a(this.f36757d);
        }
        this.f36757d = null;
    }

    /* renamed from: e */
    public abstract void mo29073e();

    /* renamed from: f */
    public abstract void mo29074f();

    /* renamed from: g */
    public void mo29354g() {
    }

    /* renamed from: h */
    public void mo29355h() {
        C8846b6.m48400a((Context) this.f36755b).mo29213a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    /* renamed from: a */
    public String mo29347a() {
        try {
            String[] strArr = this.f36762i;
            if (strArr == null || strArr.length <= 0) {
                return "";
            }
            return C9396a.m49774a(strArr[0], (String) null);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return "";
        }
    }

    /* renamed from: a */
    public void mo29349a(String str) {
        String str2;
        if (str == null || (str2 = this.f36769p) == null || str2.length() <= 0) {
            this.f36766m = str;
        } else {
            this.f36766m = str.replaceAll("startapp_adtag_placeholder", this.f36769p);
        }
    }
}
