package p079k3;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import p021c2.C1853j;
import p161w3.C5917a;

/* renamed from: k3.g */
/* compiled from: SimpleSubtitleDecoder */
public abstract class C4872g extends C1853j<C4879l, C4880m, C4876j> implements C4875i {

    /* renamed from: n */
    private final String f25803n;

    /* renamed from: k3.g$a */
    /* compiled from: SimpleSubtitleDecoder */
    class C4873a extends C4880m {
        C4873a() {
        }

        /* renamed from: w */
        public void mo7053w() {
            C4872g.this.mo7064s(this);
        }
    }

    protected C4872g(String str) {
        super(new C4879l[2], new C4880m[2]);
        this.f25803n = str;
        mo7065v(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract C4874h mo18652A(byte[] bArr, int i, boolean z) throws C4876j;

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final C4876j mo7060k(C4879l lVar, C4880m mVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C5917a.m34872e(lVar.f5430c);
            C4880m mVar2 = mVar;
            mVar2.mo18659x(lVar.f5432e, mo18652A(byteBuffer.array(), byteBuffer.limit(), z), lVar.f25806i);
            mVar.mo7030o(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (C4876j e) {
            return e;
        }
    }

    /* renamed from: b */
    public void mo18644b(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C4879l mo7057h() {
        return new C4879l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C4880m mo7058i() {
        return new C4873a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C4876j mo7059j(Throwable th) {
        return new C4876j("Unexpected decode error", th);
    }
}
