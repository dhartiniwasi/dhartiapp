package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C8025d;
import java.util.Map;
import p040e5.C4240a;
import p124r.C5413a;

/* renamed from: com.google.firebase.messaging.o0 */
/* compiled from: RemoteMessage */
public final class C8059o0 extends C4240a {
    public static final Parcelable.Creator<C8059o0> CREATOR = new C8064p0();

    /* renamed from: a */
    Bundle f34716a;

    /* renamed from: b */
    private Map<String, String> f34717b;

    /* renamed from: c */
    private C8062c f34718c;

    /* renamed from: com.google.firebase.messaging.o0$b */
    /* compiled from: RemoteMessage */
    public static class C8061b {

        /* renamed from: a */
        private final Bundle f34719a;

        /* renamed from: b */
        private final Map<String, String> f34720b = new C5413a();

        public C8061b(String str) {
            Bundle bundle = new Bundle();
            this.f34719a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        /* renamed from: a */
        public C8059o0 mo26699a() {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f34720b.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            bundle.putAll(this.f34719a);
            this.f34719a.remove("from");
            return new C8059o0(bundle);
        }

        /* renamed from: b */
        public C8061b mo26700b(String str) {
            this.f34719a.putString("collapse_key", str);
            return this;
        }

        /* renamed from: c */
        public C8061b mo26701c(Map<String, String> map) {
            this.f34720b.clear();
            this.f34720b.putAll(map);
            return this;
        }

        /* renamed from: d */
        public C8061b mo26702d(String str) {
            this.f34719a.putString("google.message_id", str);
            return this;
        }

        /* renamed from: e */
        public C8061b mo26703e(String str) {
            this.f34719a.putString("message_type", str);
            return this;
        }

        /* renamed from: f */
        public C8061b mo26704f(int i) {
            this.f34719a.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }

    /* renamed from: com.google.firebase.messaging.o0$c */
    /* compiled from: RemoteMessage */
    public static class C8062c {

        /* renamed from: a */
        private final String f34721a;

        /* renamed from: b */
        private final String f34722b;

        /* renamed from: c */
        private final String[] f34723c;

        /* renamed from: d */
        private final String f34724d;

        /* renamed from: e */
        private final String f34725e;

        /* renamed from: f */
        private final String[] f34726f;

        /* renamed from: g */
        private final String f34727g;

        /* renamed from: h */
        private final String f34728h;

        /* renamed from: i */
        private final String f34729i;

        /* renamed from: j */
        private final String f34730j;

        /* renamed from: k */
        private final String f34731k;

        /* renamed from: l */
        private final String f34732l;

        /* renamed from: m */
        private final String f34733m;

        /* renamed from: n */
        private final Uri f34734n;

        /* renamed from: o */
        private final String f34735o;

        /* renamed from: p */
        private final Integer f34736p;

        /* renamed from: q */
        private final Integer f34737q;

        /* renamed from: r */
        private final Integer f34738r;

        /* renamed from: s */
        private final int[] f34739s;

        /* renamed from: t */
        private final Long f34740t;

        /* renamed from: u */
        private final boolean f34741u;

        /* renamed from: v */
        private final boolean f34742v;

        /* renamed from: w */
        private final boolean f34743w;

        /* renamed from: x */
        private final boolean f34744x;

        /* renamed from: y */
        private final boolean f34745y;

        /* renamed from: z */
        private final long[] f34746z;

        /* renamed from: j */
        private static String[] m44395j(C8047j0 j0Var, String str) {
            Object[] g = j0Var.mo26654g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String mo26705a() {
            return this.f34724d;
        }

        /* renamed from: b */
        public String[] mo26706b() {
            return this.f34726f;
        }

        /* renamed from: c */
        public String mo26707c() {
            return this.f34725e;
        }

        /* renamed from: d */
        public String mo26708d() {
            return this.f34733m;
        }

        /* renamed from: e */
        public String mo26709e() {
            return this.f34732l;
        }

        /* renamed from: f */
        public String mo26710f() {
            return this.f34731k;
        }

        /* renamed from: g */
        public String mo26711g() {
            return this.f34727g;
        }

        /* renamed from: h */
        public Uri mo26712h() {
            String str = this.f34728h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        /* renamed from: i */
        public Uri mo26713i() {
            return this.f34734n;
        }

        /* renamed from: k */
        public Integer mo26714k() {
            return this.f34738r;
        }

        /* renamed from: l */
        public Integer mo26715l() {
            return this.f34736p;
        }

        /* renamed from: m */
        public String mo26716m() {
            return this.f34729i;
        }

        /* renamed from: n */
        public String mo26717n() {
            return this.f34730j;
        }

        /* renamed from: o */
        public String mo26718o() {
            return this.f34735o;
        }

        /* renamed from: p */
        public String mo26719p() {
            return this.f34721a;
        }

        /* renamed from: q */
        public String[] mo26720q() {
            return this.f34723c;
        }

        /* renamed from: r */
        public String mo26721r() {
            return this.f34722b;
        }

        /* renamed from: s */
        public Integer mo26722s() {
            return this.f34737q;
        }

        private C8062c(C8047j0 j0Var) {
            this.f34721a = j0Var.mo26663p("gcm.n.title");
            this.f34722b = j0Var.mo26655h("gcm.n.title");
            this.f34723c = m44395j(j0Var, "gcm.n.title");
            this.f34724d = j0Var.mo26663p("gcm.n.body");
            this.f34725e = j0Var.mo26655h("gcm.n.body");
            this.f34726f = m44395j(j0Var, "gcm.n.body");
            this.f34727g = j0Var.mo26663p("gcm.n.icon");
            this.f34729i = j0Var.mo26662o();
            this.f34730j = j0Var.mo26663p("gcm.n.tag");
            this.f34731k = j0Var.mo26663p("gcm.n.color");
            this.f34732l = j0Var.mo26663p("gcm.n.click_action");
            this.f34733m = j0Var.mo26663p("gcm.n.android_channel_id");
            this.f34734n = j0Var.mo26653f();
            this.f34728h = j0Var.mo26663p("gcm.n.image");
            this.f34735o = j0Var.mo26663p("gcm.n.ticker");
            this.f34736p = j0Var.mo26650b("gcm.n.notification_priority");
            this.f34737q = j0Var.mo26650b("gcm.n.visibility");
            this.f34738r = j0Var.mo26650b("gcm.n.notification_count");
            this.f34741u = j0Var.mo26649a("gcm.n.sticky");
            this.f34742v = j0Var.mo26649a("gcm.n.local_only");
            this.f34743w = j0Var.mo26649a("gcm.n.default_sound");
            this.f34744x = j0Var.mo26649a("gcm.n.default_vibrate_timings");
            this.f34745y = j0Var.mo26649a("gcm.n.default_light_settings");
            this.f34740t = j0Var.mo26657j("gcm.n.event_time");
            this.f34739s = j0Var.mo26652e();
            this.f34746z = j0Var.mo26664q();
        }
    }

    public C8059o0(Bundle bundle) {
        this.f34716a = bundle;
    }

    /* renamed from: M1 */
    private int m44377M1(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: I1 */
    public String mo26687I1() {
        return this.f34716a.getString("collapse_key");
    }

    /* renamed from: J1 */
    public Map<String, String> mo26688J1() {
        if (this.f34717b == null) {
            this.f34717b = C8025d.C8026a.m44216a(this.f34716a);
        }
        return this.f34717b;
    }

    /* renamed from: K1 */
    public String mo26689K1() {
        return this.f34716a.getString("from");
    }

    /* renamed from: L1 */
    public String mo26690L1() {
        String string = this.f34716a.getString("google.message_id");
        return string == null ? this.f34716a.getString("message_id") : string;
    }

    /* renamed from: N1 */
    public String mo26691N1() {
        return this.f34716a.getString("message_type");
    }

    /* renamed from: O1 */
    public C8062c mo26692O1() {
        if (this.f34718c == null && C8047j0.m44311t(this.f34716a)) {
            this.f34718c = new C8062c(new C8047j0(this.f34716a));
        }
        return this.f34718c;
    }

    /* renamed from: P1 */
    public int mo26693P1() {
        String string = this.f34716a.getString("google.original_priority");
        if (string == null) {
            string = this.f34716a.getString("google.priority");
        }
        return m44377M1(string);
    }

    /* renamed from: Q1 */
    public long mo26694Q1() {
        Object obj = this.f34716a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0;
        }
    }

    /* renamed from: R1 */
    public String mo26695R1() {
        return this.f34716a.getString("google.to");
    }

    /* renamed from: S1 */
    public int mo26696S1() {
        Object obj = this.f34716a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo26697T1(Intent intent) {
        intent.putExtras(this.f34716a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8064p0.m44414c(this, parcel, i);
    }
}
