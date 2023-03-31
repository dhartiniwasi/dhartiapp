package p348s8;

import p386w7.C12913c;
import p386w7.C12914d;

/* renamed from: s8.a */
/* compiled from: MessagingClientEvent */
public final class C12463a {

    /* renamed from: p */
    private static final C12463a f45824p = new C12464a().mo37229a();

    /* renamed from: a */
    private final long f45825a;

    /* renamed from: b */
    private final String f45826b;

    /* renamed from: c */
    private final String f45827c;

    /* renamed from: d */
    private final C12466c f45828d;

    /* renamed from: e */
    private final C12467d f45829e;

    /* renamed from: f */
    private final String f45830f;

    /* renamed from: g */
    private final String f45831g;

    /* renamed from: h */
    private final int f45832h;

    /* renamed from: i */
    private final int f45833i;

    /* renamed from: j */
    private final String f45834j;

    /* renamed from: k */
    private final long f45835k;

    /* renamed from: l */
    private final C12465b f45836l;

    /* renamed from: m */
    private final String f45837m;

    /* renamed from: n */
    private final long f45838n;

    /* renamed from: o */
    private final String f45839o;

    /* renamed from: s8.a$a */
    /* compiled from: MessagingClientEvent */
    public static final class C12464a {

        /* renamed from: a */
        private long f45840a = 0;

        /* renamed from: b */
        private String f45841b = "";

        /* renamed from: c */
        private String f45842c = "";

        /* renamed from: d */
        private C12466c f45843d = C12466c.UNKNOWN;

        /* renamed from: e */
        private C12467d f45844e = C12467d.UNKNOWN_OS;

        /* renamed from: f */
        private String f45845f = "";

        /* renamed from: g */
        private String f45846g = "";

        /* renamed from: h */
        private int f45847h = 0;

        /* renamed from: i */
        private int f45848i = 0;

        /* renamed from: j */
        private String f45849j = "";

        /* renamed from: k */
        private long f45850k = 0;

        /* renamed from: l */
        private C12465b f45851l = C12465b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f45852m = "";

        /* renamed from: n */
        private long f45853n = 0;

        /* renamed from: o */
        private String f45854o = "";

        C12464a() {
        }

        /* renamed from: a */
        public C12463a mo37229a() {
            return new C12463a(this.f45840a, this.f45841b, this.f45842c, this.f45843d, this.f45844e, this.f45845f, this.f45846g, this.f45847h, this.f45848i, this.f45849j, this.f45850k, this.f45851l, this.f45852m, this.f45853n, this.f45854o);
        }

        /* renamed from: b */
        public C12464a mo37230b(String str) {
            this.f45852m = str;
            return this;
        }

        /* renamed from: c */
        public C12464a mo37231c(String str) {
            this.f45846g = str;
            return this;
        }

        /* renamed from: d */
        public C12464a mo37232d(String str) {
            this.f45854o = str;
            return this;
        }

        /* renamed from: e */
        public C12464a mo37233e(C12465b bVar) {
            this.f45851l = bVar;
            return this;
        }

        /* renamed from: f */
        public C12464a mo37234f(String str) {
            this.f45842c = str;
            return this;
        }

        /* renamed from: g */
        public C12464a mo37235g(String str) {
            this.f45841b = str;
            return this;
        }

        /* renamed from: h */
        public C12464a mo37236h(C12466c cVar) {
            this.f45843d = cVar;
            return this;
        }

        /* renamed from: i */
        public C12464a mo37237i(String str) {
            this.f45845f = str;
            return this;
        }

        /* renamed from: j */
        public C12464a mo37238j(long j) {
            this.f45840a = j;
            return this;
        }

        /* renamed from: k */
        public C12464a mo37239k(C12467d dVar) {
            this.f45844e = dVar;
            return this;
        }

        /* renamed from: l */
        public C12464a mo37240l(String str) {
            this.f45849j = str;
            return this;
        }

        /* renamed from: m */
        public C12464a mo37241m(int i) {
            this.f45848i = i;
            return this;
        }
    }

    /* renamed from: s8.a$b */
    /* compiled from: MessagingClientEvent */
    public enum C12465b implements C12913c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: a */
        private final int f45859a;

        private C12465b(int i) {
            this.f45859a = i;
        }

        /* renamed from: f */
        public int mo19414f() {
            return this.f45859a;
        }
    }

    /* renamed from: s8.a$c */
    /* compiled from: MessagingClientEvent */
    public enum C12466c implements C12913c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a */
        private final int f45865a;

        private C12466c(int i) {
            this.f45865a = i;
        }

        /* renamed from: f */
        public int mo19414f() {
            return this.f45865a;
        }
    }

    /* renamed from: s8.a$d */
    /* compiled from: MessagingClientEvent */
    public enum C12467d implements C12913c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: a */
        private final int f45871a;

        private C12467d(int i) {
            this.f45871a = i;
        }

        /* renamed from: f */
        public int mo19414f() {
            return this.f45871a;
        }
    }

    C12463a(long j, String str, String str2, C12466c cVar, C12467d dVar, String str3, String str4, int i, int i2, String str5, long j2, C12465b bVar, String str6, long j3, String str7) {
        this.f45825a = j;
        this.f45826b = str;
        this.f45827c = str2;
        this.f45828d = cVar;
        this.f45829e = dVar;
        this.f45830f = str3;
        this.f45831g = str4;
        this.f45832h = i;
        this.f45833i = i2;
        this.f45834j = str5;
        this.f45835k = j2;
        this.f45836l = bVar;
        this.f45837m = str6;
        this.f45838n = j3;
        this.f45839o = str7;
    }

    /* renamed from: p */
    public static C12464a m59444p() {
        return new C12464a();
    }

    @C12914d(tag = 13)
    /* renamed from: a */
    public String mo37214a() {
        return this.f45837m;
    }

    @C12914d(tag = 11)
    /* renamed from: b */
    public long mo37215b() {
        return this.f45835k;
    }

    @C12914d(tag = 14)
    /* renamed from: c */
    public long mo37216c() {
        return this.f45838n;
    }

    @C12914d(tag = 7)
    /* renamed from: d */
    public String mo37217d() {
        return this.f45831g;
    }

    @C12914d(tag = 15)
    /* renamed from: e */
    public String mo37218e() {
        return this.f45839o;
    }

    @C12914d(tag = 12)
    /* renamed from: f */
    public C12465b mo37219f() {
        return this.f45836l;
    }

    @C12914d(tag = 3)
    /* renamed from: g */
    public String mo37220g() {
        return this.f45827c;
    }

    @C12914d(tag = 2)
    /* renamed from: h */
    public String mo37221h() {
        return this.f45826b;
    }

    @C12914d(tag = 4)
    /* renamed from: i */
    public C12466c mo37222i() {
        return this.f45828d;
    }

    @C12914d(tag = 6)
    /* renamed from: j */
    public String mo37223j() {
        return this.f45830f;
    }

    @C12914d(tag = 8)
    /* renamed from: k */
    public int mo37224k() {
        return this.f45832h;
    }

    @C12914d(tag = 1)
    /* renamed from: l */
    public long mo37225l() {
        return this.f45825a;
    }

    @C12914d(tag = 5)
    /* renamed from: m */
    public C12467d mo37226m() {
        return this.f45829e;
    }

    @C12914d(tag = 10)
    /* renamed from: n */
    public String mo37227n() {
        return this.f45834j;
    }

    @C12914d(tag = 9)
    /* renamed from: o */
    public int mo37228o() {
        return this.f45833i;
    }
}
