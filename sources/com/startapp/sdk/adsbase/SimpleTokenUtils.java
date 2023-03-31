package com.startapp.sdk.adsbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.C8828aa;
import com.startapp.C8837b0;
import com.startapp.C8862ba;
import com.startapp.C9023i4;
import com.startapp.C9058k0;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Sta */
public class SimpleTokenUtils {

    /* renamed from: a */
    public static List<PackageInfo> f38639a = null;

    /* renamed from: b */
    public static List<PackageInfo> f38640b = null;

    /* renamed from: c */
    public static long f38641c = 0;

    /* renamed from: d */
    public static volatile Pair<TokenType, String> f38642d = null;

    /* renamed from: e */
    public static volatile Pair<TokenType, String> f38643e = null;

    /* renamed from: f */
    public static boolean f38644f = true;

    /* renamed from: g */
    public static boolean f38645g = false;

    /* renamed from: h */
    public static TokenType f38646h = TokenType.UNDEFINED;

    /* compiled from: Sta */
    public enum TokenType {
        T1("token"),
        T2("token2"),
        UNDEFINED("");
        
        private final String text;

        /* access modifiers changed from: public */
        TokenType(String str) {
            this.text = str;
        }

        /* renamed from: a */
        public static TokenType m49716a(String str) {
            TokenType tokenType = T1;
            if (tokenType.text.equals(str)) {
                return tokenType;
            }
            TokenType tokenType2 = T2;
            if (tokenType2.text.equals(str)) {
                return tokenType2;
            }
            return UNDEFINED;
        }

        public String toString() {
            return this.text;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.SimpleTokenUtils$a */
    /* compiled from: Sta */
    public class C9384a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            SimpleTokenUtils.f38642d = null;
            SimpleTokenUtils.f38643e = null;
            SimpleTokenUtils.m49715f(context);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.SimpleTokenUtils$c */
    /* compiled from: Sta */
    public class C9386c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f38652a;

        public C9386c(Context context) {
            this.f38652a = context;
        }

        public void run() {
            SimpleTokenUtils.m49714e(this.f38652a);
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m49705a() {
        if (f38642d != null) {
            return new Pair<>(((TokenType) f38642d.first).toString(), f38642d.second);
        }
        return new Pair<>(TokenType.T1.toString(), "");
    }

    /* renamed from: b */
    public static Pair<String, String> m49708b() {
        if (f38643e != null) {
            return new Pair<>(((TokenType) f38643e.first).toString(), f38643e.second);
        }
        return new Pair<>(TokenType.T2.toString(), "");
    }

    /* renamed from: c */
    public static long m49711c() {
        return f38641c;
    }

    /* renamed from: d */
    public static void m49713d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> u = MetaData.f38952k.mo31040u();
        Set<String> D = MetaData.f38952k.mo30988D();
        f38639a = new CopyOnWriteArrayList();
        f38640b = new CopyOnWriteArrayList();
        try {
            List<PackageInfo> a = C8837b0.m48298a(packageManager);
            f38641c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo next : a) {
                if (!C8837b0.m48306a(next)) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        long j = next.firstInstallTime;
                        if (j < f38641c && j >= 1291593600000L) {
                            f38641c = j;
                        }
                    }
                    f38639a.add(next);
                    try {
                        String b = C9605vb.m50468b(context);
                        if (u != null && u.contains(b)) {
                            f38640b.add(next);
                        }
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                } else if (D.contains(next.packageName)) {
                    f38639a.add(next);
                } else if (next.packageName.equals(Constants.f39008a)) {
                    packageInfo = next;
                }
            }
            f38639a = m49707a(f38639a);
            f38640b = m49707a(f38640b);
            if (packageInfo != null) {
                f38639a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (!C9605vb.m50466a(th2, (Class<? extends Throwable>) RemoteException.class)) {
                C9023i4.m48681a(th2);
            }
        }
    }

    /* renamed from: e */
    public static void m49714e(Context context) {
        boolean a = MetaData.f38952k.mo30994J().mo31128a(context);
        synchronized (SimpleTokenUtils.class) {
            if ((f38642d == null || f38643e == null) && a) {
                try {
                    m49713d(context);
                    f38642d = new Pair<>(TokenType.T1, C8828aa.m48273a(m49710b(f38639a)));
                    f38643e = new Pair<>(TokenType.T2, C8828aa.m48273a(m49710b(f38640b)));
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        }
        return;
    }

    /* renamed from: f */
    public static void m49715f(Context context) {
        Context a = C9058k0.m48718a(context);
        if (a != null) {
            context = a;
        }
        try {
            if ((f38642d == null || f38643e == null) && MetaData.f38952k.mo30994J().mo31128a(context)) {
                ComponentLocator.m50248a(context).mo31175k().execute(new C9386c(context));
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: c */
    public static void m49712c(Context context) {
        Context a = C9058k0.m48718a(context);
        if (a != null) {
            context = a;
        }
        m49715f(context);
        f38644f = true;
        f38645g = false;
        f38646h = TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new C9384a(), intentFilter);
        MetaData.f38952k.mo31016a((C9450c) new C9385b(context));
    }

    /* renamed from: a */
    public static Pair<TokenType, String> m49706a(Context context) {
        if (f38642d == null) {
            m49714e(context);
        }
        C9441e.C9442a a = ComponentLocator.m50248a(context).mo31168d().edit();
        String str = (String) f38642d.second;
        a.mo30812a("shared_prefs_simple_token", str);
        a.f38873a.putString("shared_prefs_simple_token", str);
        a.apply();
        f38644f = false;
        f38646h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T1, f38642d.second);
    }

    /* renamed from: b */
    public static Pair<TokenType, String> m49709b(Context context) {
        if (f38643e == null) {
            m49714e(context);
        }
        C9441e.C9442a a = ComponentLocator.m50248a(context).mo31168d().edit();
        String str = (String) f38643e.second;
        a.mo30812a("shared_prefs_simple_token2", str);
        a.f38873a.putString("shared_prefs_simple_token2", str);
        a.apply();
        f38644f = false;
        f38646h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T2, f38643e.second);
    }

    /* renamed from: com.startapp.sdk.adsbase.SimpleTokenUtils$b */
    /* compiled from: Sta */
    public class C9385b implements C9450c {

        /* renamed from: a */
        public final /* synthetic */ Context f38651a;

        public C9385b(Context context) {
            this.f38651a = context;
        }

        /* renamed from: a */
        public void mo29320a(MetaDataRequest.RequestReason requestReason, boolean z) {
            if (z) {
                SimpleTokenUtils.f38642d = null;
                SimpleTokenUtils.f38643e = null;
                SimpleTokenUtils.m49715f(this.f38651a);
            }
            MetaData.f38952k.mo31016a((C9450c) this);
        }

        /* renamed from: a */
        public void mo29319a(MetaDataRequest.RequestReason requestReason) {
            MetaData.f38952k.mo31016a((C9450c) this);
        }
    }

    /* renamed from: a */
    public static List<PackageInfo> m49707a(List<PackageInfo> list) {
        if (list.size() <= 100) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        if (Build.VERSION.SDK_INT >= 9) {
            Collections.sort(arrayList, new C8862ba());
        }
        return arrayList.subList(0, 100);
    }

    /* renamed from: b */
    public static List<String> m49710b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            arrayList.add(packageInfo.packageName);
        }
        return arrayList;
    }
}
