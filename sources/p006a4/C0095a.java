package p006a4;

import android.text.TextUtils;
import java.util.List;
import p060h4.C4569q2;
import p122q4.C5399a;
import p179z3.C6334g;

/* renamed from: a4.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C0095a extends C6334g {

    /* renamed from: a4.a$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static final class C0096a extends C6334g.C6335a {
        @Deprecated
        /* renamed from: d */
        public final /* bridge */ /* synthetic */ C6334g.C6335a mo231d(C5399a aVar) {
            mo235q(aVar);
            return this;
        }

        /* renamed from: n */
        public C0096a mo232n(String str, String str2) {
            this.f30517a.mo18090A(str, str2);
            return this;
        }

        /* renamed from: o */
        public C0096a mo233o(String str, List<String> list) {
            if (list != null) {
                this.f30517a.mo18090A(str, TextUtils.join(",", list));
            }
            return this;
        }

        /* renamed from: p */
        public C0095a mo230c() {
            return new C0095a(this, (C0101f) null);
        }

        @Deprecated
        /* renamed from: q */
        public C0096a mo235q(C5399a aVar) {
            this.f30517a.mo18095F(aVar);
            return this;
        }

        /* renamed from: r */
        public C0096a mo236r(String str) {
            this.f30517a.mo18102g(str);
            return this;
        }
    }

    /* synthetic */ C0095a(C0096a aVar, C0101f fVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final C4569q2 mo229a() {
        return this.f30516a;
    }
}
