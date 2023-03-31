package p179z3;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.pm0;
import java.util.Date;
import java.util.List;
import p033d5.C4141r;
import p060h4.C4563p2;
import p060h4.C4569q2;
import p122q4.C5399a;
import p143t4.C5525a;

/* renamed from: z3.g */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C6334g {

    /* renamed from: a */
    protected final C4569q2 f30516a;

    /* renamed from: z3.g$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static class C6335a {

        /* renamed from: a */
        protected final C4563p2 f30517a;

        public C6335a() {
            C4563p2 p2Var = new C4563p2();
            this.f30517a = p2Var;
            p2Var.mo18093D("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        /* renamed from: a */
        public C6335a mo21653a(String str) {
            this.f30517a.mo18091B(str);
            return this;
        }

        /* renamed from: b */
        public C6335a mo21654b(Class<Object> cls, Bundle bundle) {
            this.f30517a.mo18092C(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f30517a.mo18094E("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        /* renamed from: c */
        public C6334g mo230c() {
            return new C6334g(this);
        }

        @Deprecated
        /* renamed from: d */
        public C6335a mo231d(C5399a aVar) {
            this.f30517a.mo18095F(aVar);
            return this;
        }

        /* renamed from: e */
        public C6335a mo21655e(String str) {
            C4141r.m28222l(str, "Content URL must be non-null.");
            C4141r.m28218h(str, "Content URL must be non-empty.");
            C4141r.m28213c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f30517a.mo18097b(str);
            return this;
        }

        /* renamed from: f */
        public C6335a mo21656f(int i) {
            this.f30517a.mo18099d(i);
            return this;
        }

        /* renamed from: g */
        public C6335a mo21657g(List<String> list) {
            if (list == null) {
                pm0.m18667g("neighboring content URLs list should not be null");
                return this;
            }
            this.f30517a.mo18101f(list);
            return this;
        }

        /* renamed from: h */
        public C6335a mo21658h(String str) {
            this.f30517a.mo18103h(str);
            return this;
        }

        @Deprecated
        /* renamed from: i */
        public final C6335a mo21659i(String str) {
            this.f30517a.mo18093D(str);
            return this;
        }

        @Deprecated
        /* renamed from: j */
        public final C6335a mo21660j(Date date) {
            this.f30517a.mo18096a(date);
            return this;
        }

        @Deprecated
        /* renamed from: k */
        public final C6335a mo21661k(int i) {
            this.f30517a.mo18098c(i);
            return this;
        }

        @Deprecated
        /* renamed from: l */
        public final C6335a mo21662l(boolean z) {
            this.f30517a.mo18100e(z);
            return this;
        }

        @Deprecated
        /* renamed from: m */
        public final C6335a mo21663m(boolean z) {
            this.f30517a.mo18104i(z);
            return this;
        }
    }

    protected C6334g(C6335a aVar) {
        this.f30516a = new C4569q2(aVar.f30517a, (C5525a) null);
    }

    /* renamed from: a */
    public C4569q2 mo229a() {
        return this.f30516a;
    }
}
