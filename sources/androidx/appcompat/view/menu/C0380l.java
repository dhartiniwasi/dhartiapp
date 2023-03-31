package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0383m;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: MenuPopupHelper */
public class C0380l {

    /* renamed from: a */
    private final Context f1194a;

    /* renamed from: b */
    private final C0367g f1195b;

    /* renamed from: c */
    private final boolean f1196c;

    /* renamed from: d */
    private final int f1197d;

    /* renamed from: e */
    private final int f1198e;

    /* renamed from: f */
    private View f1199f;

    /* renamed from: g */
    private int f1200g;

    /* renamed from: h */
    private boolean f1201h;

    /* renamed from: i */
    private C0383m.C0384a f1202i;

    /* renamed from: j */
    private C0379k f1203j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1204k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1205l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* compiled from: MenuPopupHelper */
    class C0381a implements PopupWindow.OnDismissListener {
        C0381a() {
        }

        public void onDismiss() {
            C0380l.this.mo1546e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* compiled from: MenuPopupHelper */
    static class C0382b {
        /* renamed from: a */
        static void m1929a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0380l(Context context, C0367g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0379k m1915a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1194a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            androidx.appcompat.view.menu.C0380l.C0382b.m1929a(r0, r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1194a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p048g.C4291d.f23798c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1194a
            android.view.View r3 = r14.f1199f
            int r4 = r14.f1197d
            int r5 = r14.f1198e
            boolean r6 = r14.f1196c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f1194a
            androidx.appcompat.view.menu.g r9 = r14.f1195b
            android.view.View r10 = r14.f1199f
            int r11 = r14.f1197d
            int r12 = r14.f1198e
            boolean r13 = r14.f1196c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f1195b
            r0.mo1296k(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1205l
            r0.mo1305t(r1)
            android.view.View r1 = r14.f1199f
            r0.mo1298o(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f1202i
            r0.mo1276g(r1)
            boolean r1 = r14.f1201h
            r0.mo1301q(r1)
            int r1 = r14.f1200g
            r0.mo1302r(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0380l.m1915a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m1916l(int i, int i2, boolean z, boolean z2) {
        C0379k c = mo1544c();
        c.mo1306u(z2);
        if (z) {
            if ((C0901e.m4084b(this.f1200g, C0835a0.m3682B(this.f1199f)) & 7) == 5) {
                i -= this.f1199f.getWidth();
            }
            c.mo1303s(i);
            c.mo1307v(i2);
            int i3 = (int) ((this.f1194a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1542p(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.show();
    }

    /* renamed from: b */
    public void mo1543b() {
        if (mo1545d()) {
            this.f1203j.dismiss();
        }
    }

    /* renamed from: c */
    public C0379k mo1544c() {
        if (this.f1203j == null) {
            this.f1203j = m1915a();
        }
        return this.f1203j;
    }

    /* renamed from: d */
    public boolean mo1545d() {
        C0379k kVar = this.f1203j;
        return kVar != null && kVar.mo1292b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1546e() {
        this.f1203j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1204k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1547f(View view) {
        this.f1199f = view;
    }

    /* renamed from: g */
    public void mo1548g(boolean z) {
        this.f1201h = z;
        C0379k kVar = this.f1203j;
        if (kVar != null) {
            kVar.mo1301q(z);
        }
    }

    /* renamed from: h */
    public void mo1549h(int i) {
        this.f1200g = i;
    }

    /* renamed from: i */
    public void mo1550i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1204k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1551j(C0383m.C0384a aVar) {
        this.f1202i = aVar;
        C0379k kVar = this.f1203j;
        if (kVar != null) {
            kVar.mo1276g(aVar);
        }
    }

    /* renamed from: k */
    public void mo1552k() {
        if (!mo1553m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1553m() {
        if (mo1545d()) {
            return true;
        }
        if (this.f1199f == null) {
            return false;
        }
        m1916l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1554n(int i, int i2) {
        if (mo1545d()) {
            return true;
        }
        if (this.f1199f == null) {
            return false;
        }
        m1916l(i, i2, true, true);
        return true;
    }

    public C0380l(Context context, C0367g gVar, View view, boolean z, int i, int i2) {
        this.f1200g = 8388611;
        this.f1205l = new C0381a();
        this.f1194a = context;
        this.f1195b = gVar;
        this.f1199f = view;
        this.f1196c = z;
        this.f1197d = i;
        this.f1198e = i2;
    }
}
