package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class he4 extends fo3 {

    /* renamed from: h */
    private long f10308h;

    /* renamed from: i */
    private int f10309i;

    /* renamed from: j */
    private int f10310j = 32;

    public he4() {
        super(2, 0);
    }

    /* renamed from: b */
    public final void mo10233b() {
        super.mo10233b();
        this.f10309i = 0;
    }

    /* renamed from: m */
    public final int mo10803m() {
        return this.f10309i;
    }

    /* renamed from: n */
    public final long mo10804n() {
        return this.f10308h;
    }

    /* renamed from: o */
    public final void mo10805o(int i) {
        this.f10310j = i;
    }

    /* renamed from: p */
    public final boolean mo10806p(fo3 fo3) {
        ByteBuffer byteBuffer;
        v91.m22050d(!fo3.mo15595d(1073741824));
        v91.m22050d(!fo3.mo15595d(268435456));
        v91.m22050d(!fo3.mo15595d(4));
        if (mo10807q()) {
            if (this.f10309i >= this.f10310j || fo3.mo15595d(RecyclerView.UNDEFINED_DURATION) != mo15595d(RecyclerView.UNDEFINED_DURATION)) {
                return false;
            }
            ByteBuffer byteBuffer2 = fo3.f9373c;
            if (!(byteBuffer2 == null || (byteBuffer = this.f9373c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f10309i;
        this.f10309i = i + 1;
        if (i == 0) {
            this.f9375e = fo3.f9375e;
            if (fo3.mo15595d(1)) {
                mo15594c(1);
            }
        }
        if (fo3.mo15595d(RecyclerView.UNDEFINED_DURATION)) {
            mo15594c(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer3 = fo3.f9373c;
        if (byteBuffer3 != null) {
            mo10234i(byteBuffer3.remaining());
            this.f9373c.put(byteBuffer3);
        }
        this.f10308h = fo3.f9375e;
        return true;
    }

    /* renamed from: q */
    public final boolean mo10807q() {
        return this.f10309i > 0;
    }
}
