package p079k3;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import p161w3.C5917a;
import p177z1.C6224h;
import p182a7.C6425j;

/* renamed from: k3.b */
/* compiled from: Cue */
public final class C4864b implements C6224h {

    /* renamed from: A */
    public static final C6224h.C6225a<C4864b> f25756A = C11594a.f44136a;

    /* renamed from: z */
    public static final C4864b f25757z = new C4866b().mo18638o("").mo18624a();

    /* renamed from: a */
    public final CharSequence f25758a;

    /* renamed from: b */
    public final Layout.Alignment f25759b;

    /* renamed from: c */
    public final Layout.Alignment f25760c;

    /* renamed from: d */
    public final Bitmap f25761d;

    /* renamed from: e */
    public final float f25762e;

    /* renamed from: f */
    public final int f25763f;

    /* renamed from: g */
    public final int f25764g;

    /* renamed from: h */
    public final float f25765h;

    /* renamed from: i */
    public final int f25766i;

    /* renamed from: r */
    public final float f25767r;

    /* renamed from: s */
    public final float f25768s;

    /* renamed from: t */
    public final boolean f25769t;

    /* renamed from: u */
    public final int f25770u;

    /* renamed from: v */
    public final int f25771v;

    /* renamed from: w */
    public final float f25772w;

    /* renamed from: x */
    public final int f25773x;

    /* renamed from: y */
    public final float f25774y;

    /* renamed from: k3.b$b */
    /* compiled from: Cue */
    public static final class C4866b {

        /* renamed from: a */
        private CharSequence f25775a;

        /* renamed from: b */
        private Bitmap f25776b;

        /* renamed from: c */
        private Layout.Alignment f25777c;

        /* renamed from: d */
        private Layout.Alignment f25778d;

        /* renamed from: e */
        private float f25779e;

        /* renamed from: f */
        private int f25780f;

        /* renamed from: g */
        private int f25781g;

        /* renamed from: h */
        private float f25782h;

        /* renamed from: i */
        private int f25783i;

        /* renamed from: j */
        private int f25784j;

        /* renamed from: k */
        private float f25785k;

        /* renamed from: l */
        private float f25786l;

        /* renamed from: m */
        private float f25787m;

        /* renamed from: n */
        private boolean f25788n;

        /* renamed from: o */
        private int f25789o;

        /* renamed from: p */
        private int f25790p;

        /* renamed from: q */
        private float f25791q;

        /* renamed from: a */
        public C4864b mo18624a() {
            return new C4864b(this.f25775a, this.f25777c, this.f25778d, this.f25776b, this.f25779e, this.f25780f, this.f25781g, this.f25782h, this.f25783i, this.f25784j, this.f25785k, this.f25786l, this.f25787m, this.f25788n, this.f25789o, this.f25790p, this.f25791q);
        }

        /* renamed from: b */
        public C4866b mo18625b() {
            this.f25788n = false;
            return this;
        }

        /* renamed from: c */
        public int mo18626c() {
            return this.f25781g;
        }

        /* renamed from: d */
        public int mo18627d() {
            return this.f25783i;
        }

        /* renamed from: e */
        public CharSequence mo18628e() {
            return this.f25775a;
        }

        /* renamed from: f */
        public C4866b mo18629f(Bitmap bitmap) {
            this.f25776b = bitmap;
            return this;
        }

        /* renamed from: g */
        public C4866b mo18630g(float f) {
            this.f25787m = f;
            return this;
        }

        /* renamed from: h */
        public C4866b mo18631h(float f, int i) {
            this.f25779e = f;
            this.f25780f = i;
            return this;
        }

        /* renamed from: i */
        public C4866b mo18632i(int i) {
            this.f25781g = i;
            return this;
        }

        /* renamed from: j */
        public C4866b mo18633j(Layout.Alignment alignment) {
            this.f25778d = alignment;
            return this;
        }

        /* renamed from: k */
        public C4866b mo18634k(float f) {
            this.f25782h = f;
            return this;
        }

        /* renamed from: l */
        public C4866b mo18635l(int i) {
            this.f25783i = i;
            return this;
        }

        /* renamed from: m */
        public C4866b mo18636m(float f) {
            this.f25791q = f;
            return this;
        }

        /* renamed from: n */
        public C4866b mo18637n(float f) {
            this.f25786l = f;
            return this;
        }

        /* renamed from: o */
        public C4866b mo18638o(CharSequence charSequence) {
            this.f25775a = charSequence;
            return this;
        }

        /* renamed from: p */
        public C4866b mo18639p(Layout.Alignment alignment) {
            this.f25777c = alignment;
            return this;
        }

        /* renamed from: q */
        public C4866b mo18640q(float f, int i) {
            this.f25785k = f;
            this.f25784j = i;
            return this;
        }

        /* renamed from: r */
        public C4866b mo18641r(int i) {
            this.f25790p = i;
            return this;
        }

        /* renamed from: s */
        public C4866b mo18642s(int i) {
            this.f25789o = i;
            this.f25788n = true;
            return this;
        }

        public C4866b() {
            this.f25775a = null;
            this.f25776b = null;
            this.f25777c = null;
            this.f25778d = null;
            this.f25779e = -3.4028235E38f;
            this.f25780f = RecyclerView.UNDEFINED_DURATION;
            this.f25781g = RecyclerView.UNDEFINED_DURATION;
            this.f25782h = -3.4028235E38f;
            this.f25783i = RecyclerView.UNDEFINED_DURATION;
            this.f25784j = RecyclerView.UNDEFINED_DURATION;
            this.f25785k = -3.4028235E38f;
            this.f25786l = -3.4028235E38f;
            this.f25787m = -3.4028235E38f;
            this.f25788n = false;
            this.f25789o = -16777216;
            this.f25790p = RecyclerView.UNDEFINED_DURATION;
        }

        private C4866b(C4864b bVar) {
            this.f25775a = bVar.f25758a;
            this.f25776b = bVar.f25761d;
            this.f25777c = bVar.f25759b;
            this.f25778d = bVar.f25760c;
            this.f25779e = bVar.f25762e;
            this.f25780f = bVar.f25763f;
            this.f25781g = bVar.f25764g;
            this.f25782h = bVar.f25765h;
            this.f25783i = bVar.f25766i;
            this.f25784j = bVar.f25771v;
            this.f25785k = bVar.f25772w;
            this.f25786l = bVar.f25767r;
            this.f25787m = bVar.f25768s;
            this.f25788n = bVar.f25769t;
            this.f25789o = bVar.f25770u;
            this.f25790p = bVar.f25773x;
            this.f25791q = bVar.f25774y;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C4864b m30973c(Bundle bundle) {
        C4866b bVar = new C4866b();
        CharSequence charSequence = bundle.getCharSequence(m30974d(0));
        if (charSequence != null) {
            bVar.mo18638o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m30974d(1));
        if (alignment != null) {
            bVar.mo18639p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(m30974d(2));
        if (alignment2 != null) {
            bVar.mo18633j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(m30974d(3));
        if (bitmap != null) {
            bVar.mo18629f(bitmap);
        }
        if (bundle.containsKey(m30974d(4)) && bundle.containsKey(m30974d(5))) {
            bVar.mo18631h(bundle.getFloat(m30974d(4)), bundle.getInt(m30974d(5)));
        }
        if (bundle.containsKey(m30974d(6))) {
            bVar.mo18632i(bundle.getInt(m30974d(6)));
        }
        if (bundle.containsKey(m30974d(7))) {
            bVar.mo18634k(bundle.getFloat(m30974d(7)));
        }
        if (bundle.containsKey(m30974d(8))) {
            bVar.mo18635l(bundle.getInt(m30974d(8)));
        }
        if (bundle.containsKey(m30974d(10)) && bundle.containsKey(m30974d(9))) {
            bVar.mo18640q(bundle.getFloat(m30974d(10)), bundle.getInt(m30974d(9)));
        }
        if (bundle.containsKey(m30974d(11))) {
            bVar.mo18637n(bundle.getFloat(m30974d(11)));
        }
        if (bundle.containsKey(m30974d(12))) {
            bVar.mo18630g(bundle.getFloat(m30974d(12)));
        }
        if (bundle.containsKey(m30974d(13))) {
            bVar.mo18642s(bundle.getInt(m30974d(13)));
        }
        if (!bundle.getBoolean(m30974d(14), false)) {
            bVar.mo18625b();
        }
        if (bundle.containsKey(m30974d(15))) {
            bVar.mo18641r(bundle.getInt(m30974d(15)));
        }
        if (bundle.containsKey(m30974d(16))) {
            bVar.mo18636m(bundle.getFloat(m30974d(16)));
        }
        return bVar.mo18624a();
    }

    /* renamed from: d */
    private static String m30974d(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public C4866b mo18621b() {
        return new C4866b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4864b.class != obj.getClass()) {
            return false;
        }
        C4864b bVar = (C4864b) obj;
        if (TextUtils.equals(this.f25758a, bVar.f25758a) && this.f25759b == bVar.f25759b && this.f25760c == bVar.f25760c && ((bitmap = this.f25761d) != null ? !((bitmap2 = bVar.f25761d) == null || !bitmap.sameAs(bitmap2)) : bVar.f25761d == null) && this.f25762e == bVar.f25762e && this.f25763f == bVar.f25763f && this.f25764g == bVar.f25764g && this.f25765h == bVar.f25765h && this.f25766i == bVar.f25766i && this.f25767r == bVar.f25767r && this.f25768s == bVar.f25768s && this.f25769t == bVar.f25769t && this.f25770u == bVar.f25770u && this.f25771v == bVar.f25771v && this.f25772w == bVar.f25772w && this.f25773x == bVar.f25773x && this.f25774y == bVar.f25774y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f25758a, this.f25759b, this.f25760c, this.f25761d, Float.valueOf(this.f25762e), Integer.valueOf(this.f25763f), Integer.valueOf(this.f25764g), Float.valueOf(this.f25765h), Integer.valueOf(this.f25766i), Float.valueOf(this.f25767r), Float.valueOf(this.f25768s), Boolean.valueOf(this.f25769t), Integer.valueOf(this.f25770u), Integer.valueOf(this.f25771v), Float.valueOf(this.f25772w), Integer.valueOf(this.f25773x), Float.valueOf(this.f25774y));
    }

    private C4864b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            C5917a.m34872e(bitmap);
        } else {
            C5917a.m34868a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f25758a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f25758a = charSequence.toString();
        } else {
            this.f25758a = null;
        }
        this.f25759b = alignment;
        this.f25760c = alignment2;
        this.f25761d = bitmap2;
        this.f25762e = f;
        this.f25763f = i;
        this.f25764g = i2;
        this.f25765h = f2;
        this.f25766i = i3;
        this.f25767r = f4;
        this.f25768s = f5;
        this.f25769t = z;
        this.f25770u = i5;
        this.f25771v = i4;
        this.f25772w = f3;
        this.f25773x = i6;
        this.f25774y = f6;
    }
}
