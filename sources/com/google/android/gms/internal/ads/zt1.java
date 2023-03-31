package com.google.android.gms.internal.ads;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p060h4.C4470a;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zt1 implements tc1, lb1, z91, qa1, C4470a, hf1 {

    /* renamed from: a */
    private final C2971vu f21266a;

    /* renamed from: b */
    private boolean f21267b = false;

    public zt1(C2971vu vuVar, bq2 bq2) {
        this.f21266a = vuVar;
        vuVar.mo14820c(2);
        if (bq2 != null) {
            vuVar.mo14820c(1101);
        }
    }

    /* renamed from: F */
    public final void mo10152F(C2824rv rvVar) {
        this.f21266a.mo14819b(new wt1(rvVar));
        this.f21266a.mo14820c(1104);
    }

    /* renamed from: L */
    public final void mo10153L(boolean z) {
        this.f21266a.mo14820c(true != z ? 1106 : 1105);
    }

    /* renamed from: V */
    public final void mo10154V(C2824rv rvVar) {
        this.f21266a.mo14819b(new xt1(rvVar));
        this.f21266a.mo14820c(1102);
    }

    /* renamed from: Z */
    public final synchronized void mo9822Z() {
        this.f21266a.mo14820c(6);
    }

    /* renamed from: a0 */
    public final void mo10019a0() {
        this.f21266a.mo14820c(3);
    }

    /* renamed from: b */
    public final void mo10155b() {
        this.f21266a.mo14820c(1109);
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        switch (z2Var.f25062a) {
            case 1:
                this.f21266a.mo14820c(C8710R.styleable.AppCompatTheme_switchStyle);
                return;
            case 2:
                this.f21266a.mo14820c(C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                return;
            case 3:
                this.f21266a.mo14820c(5);
                return;
            case 4:
                this.f21266a.mo14820c(C8710R.styleable.AppCompatTheme_textAppearanceListItem);
                return;
            case 5:
                this.f21266a.mo14820c(C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                return;
            case 6:
                this.f21266a.mo14820c(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall);
                return;
            case 7:
                this.f21266a.mo14820c(C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
                return;
            default:
                this.f21266a.mo14820c(4);
                return;
        }
    }

    /* renamed from: k0 */
    public final void mo10156k0(C2824rv rvVar) {
        this.f21266a.mo14819b(new yt1(rvVar));
        this.f21266a.mo14820c(1103);
    }

    public final synchronized void onAdClicked() {
        if (!this.f21267b) {
            this.f21266a.mo14820c(7);
            this.f21267b = true;
            return;
        }
        this.f21266a.mo14820c(8);
    }

    /* renamed from: t */
    public final void mo10020t(us2 us2) {
        this.f21266a.mo14819b(new vt1(us2));
    }

    /* renamed from: u0 */
    public final void mo10157u0(boolean z) {
        this.f21266a.mo14820c(true != z ? 1108 : 1107);
    }

    /* renamed from: v */
    public final void mo10021v(yg0 yg0) {
    }
}
