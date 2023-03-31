package p186ac;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p186ac.C6568r;
import p297mb.C11881b;

/* renamed from: ac.s */
/* compiled from: StandardMethodCodec */
public final class C6570s implements C6562l {

    /* renamed from: b */
    public static final C6570s f31014b = new C6570s(C6568r.f31011a);

    /* renamed from: a */
    private final C6568r f31015a;

    public C6570s(C6568r rVar) {
        this.f31015a = rVar;
    }

    /* renamed from: a */
    public C6555j mo22149a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = this.f31015a.mo22175f(byteBuffer);
        Object f2 = this.f31015a.mo22175f(byteBuffer);
        if ((f instanceof String) && !byteBuffer.hasRemaining()) {
            return new C6555j((String) f, f2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* renamed from: b */
    public ByteBuffer mo22150b(Object obj) {
        C6568r.C6569a aVar = new C6568r.C6569a();
        aVar.write(0);
        this.f31015a.mo22177p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo22178a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: c */
    public ByteBuffer mo22151c(String str, String str2, Object obj, String str3) {
        C6568r.C6569a aVar = new C6568r.C6569a();
        aVar.write(1);
        this.f31015a.mo22177p(aVar, str);
        this.f31015a.mo22177p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f31015a.mo22177p(aVar, C11881b.m57386d((Throwable) obj));
        } else {
            this.f31015a.mo22177p(aVar, obj);
        }
        this.f31015a.mo22177p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo22178a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: d */
    public ByteBuffer mo22152d(String str, String str2, Object obj) {
        C6568r.C6569a aVar = new C6568r.C6569a();
        aVar.write(1);
        this.f31015a.mo22177p(aVar, str);
        this.f31015a.mo22177p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f31015a.mo22177p(aVar, C11881b.m57386d((Throwable) obj));
        } else {
            this.f31015a.mo22177p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo22178a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: e */
    public ByteBuffer mo22153e(C6555j jVar) {
        C6568r.C6569a aVar = new C6568r.C6569a();
        this.f31015a.mo22177p(aVar, jVar.f30999a);
        this.f31015a.mo22177p(aVar, jVar.f31000b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo22178a(), 0, aVar.size());
        return allocateDirect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo22154f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            ac.r r0 = r4.f31015a
            java.lang.Object r0 = r0.mo22175f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            ac.r r0 = r4.f31015a
            java.lang.Object r0 = r0.mo22175f(r5)
            ac.r r1 = r4.f31015a
            java.lang.Object r1 = r1.mo22175f(r5)
            ac.r r2 = r4.f31015a
            java.lang.Object r2 = r2.mo22175f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            ac.e r5 = new ac.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p186ac.C6570s.mo22154f(java.nio.ByteBuffer):java.lang.Object");
    }
}
