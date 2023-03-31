package p401xd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11669k;
import p243gd.C10340l;
import p344rd.C12443p;
import p372ud.C12752c;
import p392wd.C12949b;

/* renamed from: xd.c */
/* compiled from: Strings.kt */
final class C12995c implements C12949b<C12752c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f47254a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f47255b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f47256c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12443p<CharSequence, Integer, C10340l<Integer, Integer>> f47257d;

    /* renamed from: xd.c$a */
    /* compiled from: Strings.kt */
    public static final class C12996a implements Iterator<C12752c> {

        /* renamed from: a */
        private int f47258a = -1;

        /* renamed from: b */
        private int f47259b;

        /* renamed from: c */
        private int f47260c;

        /* renamed from: d */
        private C12752c f47261d;

        /* renamed from: e */
        private int f47262e;

        /* renamed from: f */
        final /* synthetic */ C12995c f47263f;

        C12996a(C12995c cVar) {
            this.f47263f = cVar;
            int e = C12756f.m60453e(cVar.f47255b, 0, cVar.f47254a.length());
            this.f47259b = e;
            this.f47260c = e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p401xd.C12995c.m61220c(r6.f47263f)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m61222a() {
            /*
                r6 = this;
                int r0 = r6.f47260c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f47258a = r1
                r0 = 0
                r6.f47261d = r0
                goto L_0x009e
            L_0x000c:
                xd.c r0 = r6.f47263f
                int r0 = r0.f47256c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f47262e
                int r0 = r0 + r3
                r6.f47262e = r0
                xd.c r4 = r6.f47263f
                int r4 = r4.f47256c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f47260c
                xd.c r4 = r6.f47263f
                java.lang.CharSequence r4 = r4.f47254a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                ud.c r0 = new ud.c
                int r1 = r6.f47259b
                xd.c r4 = r6.f47263f
                java.lang.CharSequence r4 = r4.f47254a
                int r4 = p401xd.C13011o.m61302t(r4)
                r0.<init>(r1, r4)
                r6.f47261d = r0
                r6.f47260c = r2
                goto L_0x009c
            L_0x0047:
                xd.c r0 = r6.f47263f
                rd.p r0 = r0.f47257d
                xd.c r4 = r6.f47263f
                java.lang.CharSequence r4 = r4.f47254a
                int r5 = r6.f47260c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                gd.l r0 = (p243gd.C10340l) r0
                if (r0 != 0) goto L_0x0077
                ud.c r0 = new ud.c
                int r1 = r6.f47259b
                xd.c r4 = r6.f47263f
                java.lang.CharSequence r4 = r4.f47254a
                int r4 = p401xd.C13011o.m61302t(r4)
                r0.<init>(r1, r4)
                r6.f47261d = r0
                r6.f47260c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.mo33173a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo33174b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f47259b
                ud.c r4 = p372ud.C12756f.m60455g(r4, r2)
                r6.f47261d = r4
                int r2 = r2 + r0
                r6.f47259b = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f47260c = r2
            L_0x009c:
                r6.f47258a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p401xd.C12995c.C12996a.m61222a():void");
        }

        /* renamed from: c */
        public C12752c next() {
            if (this.f47258a == -1) {
                m61222a();
            }
            if (this.f47258a != 0) {
                C12752c cVar = this.f47261d;
                C11669k.m56785c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f47261d = null;
                this.f47258a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f47258a == -1) {
                m61222a();
            }
            return this.f47258a == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12995c(CharSequence charSequence, int i, int i2, C12443p<? super CharSequence, ? super Integer, C10340l<Integer, Integer>> pVar) {
        C11669k.m56787e(charSequence, "input");
        C11669k.m56787e(pVar, "getNextMatch");
        this.f47254a = charSequence;
        this.f47255b = i;
        this.f47256c = i2;
        this.f47257d = pVar;
    }

    public Iterator<C12752c> iterator() {
        return new C12996a(this);
    }
}
