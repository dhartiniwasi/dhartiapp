package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.C8289a;
import java.util.HashMap;

public class PermissionsActivity extends Activity {

    /* renamed from: c */
    private static final String f35292c = "com.onesignal.PermissionsActivity";

    /* renamed from: d */
    private static boolean f35293d;

    /* renamed from: e */
    private static boolean f35294e;

    /* renamed from: f */
    private static boolean f35295f;

    /* renamed from: g */
    private static C8289a.C8291b f35296g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final HashMap<String, C8288c> f35297h = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f35298a;

    /* renamed from: b */
    private String f35299b;

    /* renamed from: com.onesignal.PermissionsActivity$a */
    class C8286a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int[] f35300a;

        C8286a(int[] iArr) {
            this.f35300a = iArr;
        }

        public void run() {
            int[] iArr = this.f35300a;
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            C8288c cVar = (C8288c) PermissionsActivity.f35297h.get(PermissionsActivity.this.f35298a);
            if (cVar == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: " + PermissionsActivity.this.f35298a);
            } else if (z) {
                cVar.mo27566a();
            } else {
                cVar.mo27567b(PermissionsActivity.this.m46229h());
            }
        }
    }

    /* renamed from: com.onesignal.PermissionsActivity$b */
    class C8287b extends C8289a.C8291b {

        /* renamed from: a */
        final /* synthetic */ String f35302a;

        /* renamed from: b */
        final /* synthetic */ String f35303b;

        /* renamed from: c */
        final /* synthetic */ Class f35304c;

        C8287b(String str, String str2, Class cls) {
            this.f35302a = str;
            this.f35303b = str2;
            this.f35304c = cls;
        }

        /* renamed from: a */
        public void mo27565a(Activity activity) {
            Class<PermissionsActivity> cls = PermissionsActivity.class;
            if (!activity.getClass().equals(cls)) {
                Intent intent = new Intent(activity, cls);
                intent.setFlags(131072);
                intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f35302a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f35303b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f35304c.getName());
                activity.startActivity(intent);
                activity.overridePendingTransition(C8650x3.onesignal_fade_in, C8650x3.onesignal_fade_out);
            }
        }
    }

    /* renamed from: com.onesignal.PermissionsActivity$c */
    interface C8288c {
        /* renamed from: a */
        void mo27566a();

        /* renamed from: b */
        void mo27567b(boolean z);
    }

    /* renamed from: d */
    private void m46225d(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(C8650x3.onesignal_fade_in, C8650x3.onesignal_fade_out);
            return;
        }
        m46228g(bundle);
        this.f35298a = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
        String string = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.f35299b = string;
        m46227f(string);
    }

    /* renamed from: e */
    public static void m46226e(String str, C8288c cVar) {
        f35297h.put(str, cVar);
    }

    /* renamed from: f */
    private void m46227f(String str) {
        if (!f35293d) {
            f35293d = true;
            f35295f = !C8327d.m46369b(this, str);
            C8327d.m46368a(this, new String[]{str}, 2);
        }
    }

    /* renamed from: g */
    private void m46228g(Bundle bundle) {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m46229h() {
        return f35294e && f35295f && !C8327d.m46369b(this, this.f35299b);
    }

    /* renamed from: i */
    static void m46230i(boolean z, String str, String str2, Class<?> cls) {
        if (!f35293d) {
            f35294e = z;
            f35296g = new C8287b(str, str2, cls);
            C8289a b = C8301b.m46281b();
            if (b != null) {
                b.mo27574b(f35292c, f35296g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8338d3.m46506d1(this);
        m46225d(getIntent().getExtras());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m46225d(intent.getExtras());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f35293d = false;
        if (i == 2) {
            new Handler().postDelayed(new C8286a(iArr), 500);
        }
        C8289a b = C8301b.m46281b();
        if (b != null) {
            b.mo27584q(f35292c);
        }
        finish();
        overridePendingTransition(C8650x3.onesignal_fade_in, C8650x3.onesignal_fade_out);
    }
}
