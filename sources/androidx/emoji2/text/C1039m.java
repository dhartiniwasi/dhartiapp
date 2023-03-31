package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p010os.C0777m;
import androidx.core.util.C0831h;
import java.io.IOException;
import java.nio.ByteBuffer;
import p002a0.C0003b;

/* renamed from: androidx.emoji2.text.m */
/* compiled from: MetadataRepo */
public final class C1039m {

    /* renamed from: a */
    private final C0003b f2789a;

    /* renamed from: b */
    private final char[] f2790b;

    /* renamed from: c */
    private final C1040a f2791c = new C1040a(1024);

    /* renamed from: d */
    private final Typeface f2792d;

    /* renamed from: androidx.emoji2.text.m$a */
    /* compiled from: MetadataRepo */
    static class C1040a {

        /* renamed from: a */
        private final SparseArray<C1040a> f2793a;

        /* renamed from: b */
        private C1026g f2794b;

        private C1040a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1040a mo3690a(int i) {
            SparseArray<C1040a> sparseArray = this.f2793a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C1026g mo3691b() {
            return this.f2794b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3692c(C1026g gVar, int i, int i2) {
            C1040a a = mo3690a(gVar.mo3652b(i));
            if (a == null) {
                a = new C1040a();
                this.f2793a.put(gVar.mo3652b(i), a);
            }
            if (i2 > i) {
                a.mo3692c(gVar, i + 1, i2);
            } else {
                a.f2794b = gVar;
            }
        }

        C1040a(int i) {
            this.f2793a = new SparseArray<>(i);
        }
    }

    private C1039m(Typeface typeface, C0003b bVar) {
        this.f2792d = typeface;
        this.f2789a = bVar;
        this.f2790b = new char[(bVar.mo18k() * 2)];
        m4636a(bVar);
    }

    /* renamed from: a */
    private void m4636a(C0003b bVar) {
        int k = bVar.mo18k();
        for (int i = 0; i < k; i++) {
            C1026g gVar = new C1026g(this, i);
            Character.toChars(gVar.mo3656f(), this.f2790b, i * 2);
            mo3689h(gVar);
        }
    }

    /* renamed from: b */
    public static C1039m m4637b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            C0777m.m3535a("EmojiCompat.MetadataRepo.create");
            return new C1039m(typeface, C1035l.m4624b(byteBuffer));
        } finally {
            C0777m.m3536b();
        }
    }

    /* renamed from: c */
    public char[] mo3684c() {
        return this.f2790b;
    }

    /* renamed from: d */
    public C0003b mo3685d() {
        return this.f2789a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3686e() {
        return this.f2789a.mo19l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1040a mo3687f() {
        return this.f2791c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface mo3688g() {
        return this.f2792d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3689h(C1026g gVar) {
        C0831h.m3663g(gVar, "emoji metadata cannot be null");
        C0831h.m3657a(gVar.mo3653c() > 0, "invalid metadata codepoint length");
        this.f2791c.mo3692c(gVar, 0, gVar.mo3653c() - 1);
    }
}
