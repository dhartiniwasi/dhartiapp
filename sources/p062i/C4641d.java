package p062i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p062i.C4635b;

/* renamed from: i.d */
/* compiled from: StateListDrawable */
class C4641d extends C4635b {

    /* renamed from: u */
    private C4642a f25136u;

    /* renamed from: v */
    private boolean f25137v;

    /* renamed from: i.d$a */
    /* compiled from: StateListDrawable */
    static class C4642a extends C4635b.C4639d {

        /* renamed from: J */
        int[][] f25138J;

        C4642a(C4642a aVar, C4641d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f25138J = aVar.f25138J;
            } else {
                this.f25138J = new int[mo18264f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo18313A(int[] iArr) {
            int[][] iArr2 = this.f25138J;
            int h = mo18267h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C4641d(this, (Resources) null);
        }

        /* renamed from: o */
        public void mo18274o(int i, int i2) {
            super.mo18274o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f25138J, 0, iArr, 0, i);
            this.f25138J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo18240r() {
            int[][] iArr = this.f25138J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f25138J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f25138J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo18314z(int[] iArr, Drawable drawable) {
            int a = mo18259a(drawable);
            this.f25138J[a] = iArr;
            return a;
        }

        public Drawable newDrawable(Resources resources) {
            return new C4641d(this, resources);
        }
    }

    C4641d(C4642a aVar, Resources resources) {
        mo18209h(new C4642a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18209h(C4635b.C4639d dVar) {
        super.mo18209h(dVar);
        if (dVar instanceof C4642a) {
            this.f25136u = (C4642a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C4642a mo18195b() {
        return new C4642a(this.f25136u, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo18312k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f25137v && super.mutate() == this) {
            this.f25136u.mo18240r();
            this.f25137v = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f25136u.mo18313A(iArr);
        if (A < 0) {
            A = this.f25136u.mo18313A(StateSet.WILD_CARD);
        }
        return mo18248g(A) || onStateChange;
    }

    C4641d(C4642a aVar) {
        if (aVar != null) {
            mo18209h(aVar);
        }
    }
}
