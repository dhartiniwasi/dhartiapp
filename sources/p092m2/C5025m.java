package p092m2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p037e2.C4190a0;
import p037e2.C4216m;
import p127r2.C5432a;
import p161w3.C5918a0;
import p166x2.C6046c;
import p177z1.C6249m2;
import p182a7.C6436q;

/* renamed from: m2.m */
/* compiled from: SefReader */
final class C5025m {

    /* renamed from: d */
    private static final C6436q f26330d = C6436q.m37578d(':');

    /* renamed from: e */
    private static final C6436q f26331e = C6436q.m37578d('*');

    /* renamed from: a */
    private final List<C5026a> f26332a = new ArrayList();

    /* renamed from: b */
    private int f26333b = 0;

    /* renamed from: c */
    private int f26334c;

    /* renamed from: m2.m$a */
    /* compiled from: SefReader */
    private static final class C5026a {

        /* renamed from: a */
        public final int f26335a;

        /* renamed from: b */
        public final long f26336b;

        /* renamed from: c */
        public final int f26337c;

        public C5026a(int i, long j, int i2) {
            this.f26335a = i;
            this.f26336b = j;
            this.f26337c = i2;
        }
    }

    /* renamed from: a */
    private void m31718a(C4216m mVar, C4190a0 a0Var) throws IOException {
        C5918a0 a0Var2 = new C5918a0(8);
        mVar.readFully(a0Var2.mo20551d(), 0, 8);
        this.f26334c = a0Var2.mo20563p() + 8;
        if (a0Var2.mo20560m() != 1397048916) {
            a0Var.f23479a = 0;
            return;
        }
        a0Var.f23479a = mVar.mo17554c() - ((long) (this.f26334c - 12));
        this.f26333b = 2;
    }

    /* renamed from: b */
    private static int m31719b(String str) throws C6249m2 {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw C6249m2.m36661a("Invalid SEF name", (Throwable) null);
        }
    }

    /* renamed from: d */
    private void m31720d(C4216m mVar, C4190a0 a0Var) throws IOException {
        long b = mVar.mo17553b();
        int i = (this.f26334c - 12) - 8;
        C5918a0 a0Var2 = new C5918a0(i);
        mVar.readFully(a0Var2.mo20551d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            a0Var2.mo20547P(2);
            short r = a0Var2.mo20565r();
            if (r == 2192 || r == 2816 || r == 2817 || r == 2819 || r == 2820) {
                this.f26332a.add(new C5026a(r, (b - ((long) this.f26334c)) - ((long) a0Var2.mo20563p()), a0Var2.mo20563p()));
            } else {
                a0Var2.mo20547P(8);
            }
        }
        if (this.f26332a.isEmpty()) {
            a0Var.f23479a = 0;
            return;
        }
        this.f26333b = 3;
        a0Var.f23479a = this.f26332a.get(0).f26336b;
    }

    /* renamed from: e */
    private void m31721e(C4216m mVar, List<C5432a.C5434b> list) throws IOException {
        long c = mVar.mo17554c();
        int b = (int) ((mVar.mo17553b() - mVar.mo17554c()) - ((long) this.f26334c));
        C5918a0 a0Var = new C5918a0(b);
        mVar.readFully(a0Var.mo20551d(), 0, b);
        for (int i = 0; i < this.f26332a.size(); i++) {
            C5026a aVar = this.f26332a.get(i);
            a0Var.mo20546O((int) (aVar.f26336b - c));
            a0Var.mo20547P(4);
            int p = a0Var.mo20563p();
            int b2 = m31719b(a0Var.mo20573z(p));
            int i2 = aVar.f26337c - (p + 8);
            if (b2 == 2192) {
                list.add(m31722f(a0Var, i2));
            } else if (!(b2 == 2816 || b2 == 2817 || b2 == 2819 || b2 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: f */
    private static C6046c m31722f(C5918a0 a0Var, int i) throws C6249m2 {
        ArrayList arrayList = new ArrayList();
        List<String> f = f26331e.mo21850f(a0Var.mo20573z(i));
        int i2 = 0;
        while (i2 < f.size()) {
            List<String> f2 = f26330d.mo21850f(f.get(i2));
            if (f2.size() == 3) {
                try {
                    arrayList.add(new C6046c.C6048b(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << (Integer.parseInt(f2.get(2)) - 1)));
                    i2++;
                } catch (NumberFormatException e) {
                    throw C6249m2.m36661a((String) null, e);
                }
            } else {
                throw C6249m2.m36661a((String) null, (Throwable) null);
            }
        }
        return new C6046c(arrayList);
    }

    /* renamed from: c */
    public int mo18952c(C4216m mVar, C4190a0 a0Var, List<C5432a.C5434b> list) throws IOException {
        int i = this.f26333b;
        long j = 0;
        if (i == 0) {
            long b = mVar.mo17553b();
            if (b != -1 && b >= 8) {
                j = b - 8;
            }
            a0Var.f23479a = j;
            this.f26333b = 1;
        } else if (i == 1) {
            m31718a(mVar, a0Var);
        } else if (i == 2) {
            m31720d(mVar, a0Var);
        } else if (i == 3) {
            m31721e(mVar, list);
            a0Var.f23479a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    /* renamed from: g */
    public void mo18953g() {
        this.f26332a.clear();
        this.f26333b = 0;
    }
}
