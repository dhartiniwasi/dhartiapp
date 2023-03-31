package p066i4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.pm0;
import p039e4.C4238a;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;
import p067i5.C4699m;

/* renamed from: i4.w */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4683w extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ImageButton f25246a;

    /* renamed from: b */
    private final C4664e f25247b;

    public C4683w(Context context, C4682v vVar, C4664e eVar) {
        super(context);
        this.f25247b = eVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f25246a = imageButton;
        m30361c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C4584t.m30036b();
        int y = im0.m14418y(context, vVar.f25242a);
        C4584t.m30036b();
        int y2 = im0.m14418y(context, 0);
        C4584t.m30036b();
        int y3 = im0.m14418y(context, vVar.f25243b);
        C4584t.m30036b();
        imageButton.setPadding(y, y2, y3, im0.m14418y(context, vVar.f25244c));
        imageButton.setContentDescription("Interstitial close button");
        C4584t.m30036b();
        int y4 = im0.m14418y(context, vVar.f25245d + vVar.f25242a + vVar.f25243b);
        C4584t.m30036b();
        addView(imageButton, new FrameLayout.LayoutParams(y4, im0.m14418y(context, vVar.f25245d + vVar.f25244c), 17));
        long longValue = ((Long) C4596v.m30088c().mo12227b(C2679nz.f14462W0)).longValue();
        if (longValue > 0) {
            C4681u uVar = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14471X0)).booleanValue() ? new C4681u(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(uVar);
        }
    }

    /* renamed from: c */
    private final void m30361c() {
        String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14453V0);
        if (!C4699m.m30415f() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f25246a.setImageResource(17301527);
            return;
        }
        Resources d = C4409t.m29325q().mo15114d();
        if (d != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = d.getDrawable(C4238a.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = d.getDrawable(C4238a.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                pm0.m18662b("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.f25246a.setImageResource(17301527);
                return;
            }
            this.f25246a.setImageDrawable(drawable);
            this.f25246a.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.f25246a.setImageResource(17301527);
    }

    /* renamed from: b */
    public final void mo18367b(boolean z) {
        if (z) {
            this.f25246a.setVisibility(8);
            if (((Long) C4596v.m30088c().mo12227b(C2679nz.f14462W0)).longValue() > 0) {
                this.f25246a.animate().cancel();
                this.f25246a.clearAnimation();
                return;
            }
            return;
        }
        this.f25246a.setVisibility(0);
    }

    public final void onClick(View view) {
        C4664e eVar = this.f25247b;
        if (eVar != null) {
            eVar.mo15462T5();
        }
    }
}
