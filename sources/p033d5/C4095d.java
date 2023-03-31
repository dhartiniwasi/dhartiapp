package p033d5;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p124r.C5415b;
import p189b6.C6606a;

/* renamed from: d5.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4095d {

    /* renamed from: a */
    private final Account f23270a;

    /* renamed from: b */
    private final Set<Scope> f23271b;

    /* renamed from: c */
    private final Set<Scope> f23272c;

    /* renamed from: d */
    private final Map<C2051a<?>, C4093c0> f23273d;

    /* renamed from: e */
    private final int f23274e;

    /* renamed from: f */
    private final View f23275f;

    /* renamed from: g */
    private final String f23276g;

    /* renamed from: h */
    private final String f23277h;

    /* renamed from: i */
    private final C6606a f23278i;

    /* renamed from: j */
    private Integer f23279j;

    /* renamed from: d5.d$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C4096a {

        /* renamed from: a */
        private Account f23280a;

        /* renamed from: b */
        private C5415b<Scope> f23281b;

        /* renamed from: c */
        private String f23282c;

        /* renamed from: d */
        private String f23283d;

        /* renamed from: e */
        private C6606a f23284e = C6606a.f31061k;

        /* renamed from: a */
        public C4095d mo17369a() {
            return new C4095d(this.f23280a, this.f23281b, (Map<C2051a<?>, C4093c0>) null, 0, (View) null, this.f23282c, this.f23283d, this.f23284e, false);
        }

        /* renamed from: b */
        public C4096a mo17370b(String str) {
            this.f23282c = str;
            return this;
        }

        /* renamed from: c */
        public final C4096a mo17371c(Collection<Scope> collection) {
            if (this.f23281b == null) {
                this.f23281b = new C5415b<>();
            }
            this.f23281b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C4096a mo17372d(Account account) {
            this.f23280a = account;
            return this;
        }

        /* renamed from: e */
        public final C4096a mo17373e(String str) {
            this.f23283d = str;
            return this;
        }
    }

    public C4095d(Account account, Set<Scope> set, Map<C2051a<?>, C4093c0> map, int i, View view, String str, String str2, C6606a aVar, boolean z) {
        this.f23270a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f23271b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f23273d = map;
        this.f23275f = view;
        this.f23274e = i;
        this.f23276g = str;
        this.f23277h = str2;
        this.f23278i = aVar == null ? C6606a.f31061k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C4093c0 c0Var : map.values()) {
            hashSet.addAll(c0Var.f23269a);
        }
        this.f23272c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account mo17359a() {
        return this.f23270a;
    }

    /* renamed from: b */
    public Account mo17360b() {
        Account account = this.f23270a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public Set<Scope> mo17361c() {
        return this.f23272c;
    }

    /* renamed from: d */
    public String mo17362d() {
        return this.f23276g;
    }

    /* renamed from: e */
    public Set<Scope> mo17363e() {
        return this.f23271b;
    }

    /* renamed from: f */
    public final C6606a mo17364f() {
        return this.f23278i;
    }

    /* renamed from: g */
    public final Integer mo17365g() {
        return this.f23279j;
    }

    /* renamed from: h */
    public final String mo17366h() {
        return this.f23277h;
    }

    /* renamed from: i */
    public final Map<C2051a<?>, C4093c0> mo17367i() {
        return this.f23273d;
    }

    /* renamed from: j */
    public final void mo17368j(Integer num) {
        this.f23279j = num;
    }
}
