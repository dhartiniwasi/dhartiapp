package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.p */
/* compiled from: Person */
public class C0672p {

    /* renamed from: a */
    CharSequence f2187a;

    /* renamed from: b */
    IconCompat f2188b;

    /* renamed from: c */
    String f2189c;

    /* renamed from: d */
    String f2190d;

    /* renamed from: e */
    boolean f2191e;

    /* renamed from: f */
    boolean f2192f;

    /* renamed from: androidx.core.app.p$a */
    /* compiled from: Person */
    static class C0673a {
        /* renamed from: a */
        static C0672p m3125a(Person person) {
            return new C0674b().mo2991f(person.getName()).mo2988c(person.getIcon() != null ? IconCompat.m3325f(person.getIcon()) : null).mo2992g(person.getUri()).mo2990e(person.getKey()).mo2987b(person.isBot()).mo2989d(person.isImportant()).mo2986a();
        }

        /* renamed from: b */
        static Person m3126b(C0672p pVar) {
            return new Person.Builder().setName(pVar.mo2980c()).setIcon(pVar.mo2978a() != null ? pVar.mo2978a().mo3068x() : null).setUri(pVar.mo2981d()).setKey(pVar.mo2979b()).setBot(pVar.mo2982e()).setImportant(pVar.mo2983f()).build();
        }
    }

    /* renamed from: androidx.core.app.p$b */
    /* compiled from: Person */
    public static class C0674b {

        /* renamed from: a */
        CharSequence f2193a;

        /* renamed from: b */
        IconCompat f2194b;

        /* renamed from: c */
        String f2195c;

        /* renamed from: d */
        String f2196d;

        /* renamed from: e */
        boolean f2197e;

        /* renamed from: f */
        boolean f2198f;

        /* renamed from: a */
        public C0672p mo2986a() {
            return new C0672p(this);
        }

        /* renamed from: b */
        public C0674b mo2987b(boolean z) {
            this.f2197e = z;
            return this;
        }

        /* renamed from: c */
        public C0674b mo2988c(IconCompat iconCompat) {
            this.f2194b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C0674b mo2989d(boolean z) {
            this.f2198f = z;
            return this;
        }

        /* renamed from: e */
        public C0674b mo2990e(String str) {
            this.f2196d = str;
            return this;
        }

        /* renamed from: f */
        public C0674b mo2991f(CharSequence charSequence) {
            this.f2193a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0674b mo2992g(String str) {
            this.f2195c = str;
            return this;
        }
    }

    C0672p(C0674b bVar) {
        this.f2187a = bVar.f2193a;
        this.f2188b = bVar.f2194b;
        this.f2189c = bVar.f2195c;
        this.f2190d = bVar.f2196d;
        this.f2191e = bVar.f2197e;
        this.f2192f = bVar.f2198f;
    }

    /* renamed from: a */
    public IconCompat mo2978a() {
        return this.f2188b;
    }

    /* renamed from: b */
    public String mo2979b() {
        return this.f2190d;
    }

    /* renamed from: c */
    public CharSequence mo2980c() {
        return this.f2187a;
    }

    /* renamed from: d */
    public String mo2981d() {
        return this.f2189c;
    }

    /* renamed from: e */
    public boolean mo2982e() {
        return this.f2191e;
    }

    /* renamed from: f */
    public boolean mo2983f() {
        return this.f2192f;
    }

    /* renamed from: g */
    public String mo2984g() {
        String str = this.f2189c;
        if (str != null) {
            return str;
        }
        if (this.f2187a == null) {
            return "";
        }
        return "name:" + this.f2187a;
    }

    /* renamed from: h */
    public Person mo2985h() {
        return C0673a.m3126b(this);
    }
}
