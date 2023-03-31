package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.firestore.q */
/* compiled from: FieldValue */
public abstract class C7934q {

    /* renamed from: a */
    private static final C7937c f34391a = new C7937c();

    /* renamed from: b */
    private static final C7939e f34392b = new C7939e();

    /* renamed from: com.google.firebase.firestore.q$a */
    /* compiled from: FieldValue */
    static class C7935a extends C7934q {

        /* renamed from: c */
        private final List<Object> f34393c;

        C7935a(List<Object> list) {
            this.f34393c = list;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo26432d() {
            return "FieldValue.arrayRemove";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public List<Object> mo26433h() {
            return this.f34393c;
        }
    }

    /* renamed from: com.google.firebase.firestore.q$b */
    /* compiled from: FieldValue */
    static class C7936b extends C7934q {

        /* renamed from: c */
        private final List<Object> f34394c;

        C7936b(List<Object> list) {
            this.f34394c = list;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo26432d() {
            return "FieldValue.arrayUnion";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public List<Object> mo26434h() {
            return this.f34394c;
        }
    }

    /* renamed from: com.google.firebase.firestore.q$c */
    /* compiled from: FieldValue */
    static class C7937c extends C7934q {
        C7937c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo26432d() {
            return "FieldValue.delete";
        }
    }

    /* renamed from: com.google.firebase.firestore.q$d */
    /* compiled from: FieldValue */
    static class C7938d extends C7934q {

        /* renamed from: c */
        private final Number f34395c;

        C7938d(Number number) {
            this.f34395c = number;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo26432d() {
            return "FieldValue.increment";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Number mo26435h() {
            return this.f34395c;
        }
    }

    /* renamed from: com.google.firebase.firestore.q$e */
    /* compiled from: FieldValue */
    static class C7939e extends C7934q {
        C7939e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo26432d() {
            return "FieldValue.serverTimestamp";
        }
    }

    C7934q() {
    }

    /* renamed from: a */
    public static C7934q m43836a(Object... objArr) {
        return new C7935a(Arrays.asList(objArr));
    }

    /* renamed from: b */
    public static C7934q m43837b(Object... objArr) {
        return new C7936b(Arrays.asList(objArr));
    }

    /* renamed from: c */
    public static C7934q m43838c() {
        return f34391a;
    }

    /* renamed from: e */
    public static C7934q m43839e(double d) {
        return new C7938d(Double.valueOf(d));
    }

    /* renamed from: f */
    public static C7934q m43840f(long j) {
        return new C7938d(Long.valueOf(j));
    }

    /* renamed from: g */
    public static C7934q m43841g() {
        return f34392b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract String mo26432d();
}
