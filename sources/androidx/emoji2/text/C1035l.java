package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p002a0.C0003b;

/* renamed from: androidx.emoji2.text.l */
/* compiled from: MetadataListReader */
class C1035l {

    /* renamed from: androidx.emoji2.text.l$a */
    /* compiled from: MetadataListReader */
    private static class C1036a implements C1038c {

        /* renamed from: a */
        private final ByteBuffer f2786a;

        C1036a(ByteBuffer byteBuffer) {
            this.f2786a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public void mo3678a(int i) throws IOException {
            ByteBuffer byteBuffer = this.f2786a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: c */
        public long mo3679c() {
            return (long) this.f2786a.position();
        }

        /* renamed from: d */
        public int mo3680d() throws IOException {
            return this.f2786a.getInt();
        }

        /* renamed from: e */
        public long mo3681e() throws IOException {
            return C1035l.m4625c(this.f2786a.getInt());
        }

        public int readUnsignedShort() throws IOException {
            return C1035l.m4626d(this.f2786a.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.l$b */
    /* compiled from: MetadataListReader */
    private static class C1037b {

        /* renamed from: a */
        private final long f2787a;

        /* renamed from: b */
        private final long f2788b;

        C1037b(long j, long j2) {
            this.f2787a = j;
            this.f2788b = j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3683a() {
            return this.f2787a;
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    /* compiled from: MetadataListReader */
    private interface C1038c {
        /* renamed from: a */
        void mo3678a(int i) throws IOException;

        /* renamed from: c */
        long mo3679c();

        /* renamed from: d */
        int mo3680d() throws IOException;

        /* renamed from: e */
        long mo3681e() throws IOException;

        int readUnsignedShort() throws IOException;
    }

    /* renamed from: a */
    private static C1037b m4623a(C1038c cVar) throws IOException {
        long j;
        cVar.mo3678a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo3678a(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int d = cVar.mo3680d();
                cVar.mo3678a(4);
                j = cVar.mo3681e();
                cVar.mo3678a(4);
                if (1835365473 == d) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo3678a((int) (j - cVar.mo3679c()));
                cVar.mo3678a(12);
                long e = cVar.mo3681e();
                for (int i2 = 0; ((long) i2) < e; i2++) {
                    int d2 = cVar.mo3680d();
                    long e2 = cVar.mo3681e();
                    long e3 = cVar.mo3681e();
                    if (1164798569 == d2 || 1701669481 == d2) {
                        return new C1037b(e2 + j, e3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    static C0003b m4624b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m4623a(new C1036a(duplicate)).mo3683a());
        return C0003b.m14h(duplicate);
    }

    /* renamed from: c */
    static long m4625c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: d */
    static int m4626d(short s) {
        return s & 65535;
    }
}
