package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import com.startapp.C8981g7;
import com.startapp.C9265rb;
import java.util.Map;

/* compiled from: Sta */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j */
    public static final int f39116j = Color.rgb(78, 86, C8710R.styleable.AppCompatTheme_switchStyle);

    /* renamed from: k */
    public static final int f39117k = Color.rgb(148, 155, 166);

    /* renamed from: a */
    public RelativeLayout f39118a;

    /* renamed from: b */
    public ImageView f39119b;

    /* renamed from: c */
    public ImageView f39120c;

    /* renamed from: d */
    public ImageView f39121d;

    /* renamed from: e */
    public ImageView f39122e;

    /* renamed from: f */
    public TextView f39123f;

    /* renamed from: g */
    public TextView f39124g;

    /* renamed from: h */
    public Boolean f39125h = Boolean.FALSE;

    /* renamed from: i */
    public Map<String, C8981g7> f39126i;

    public NavigationBarLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo31197a(WebView webView) {
        if (this.f39125h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f39122e.setImageBitmap(this.f39126i.get("BACK_DARK").f36851a);
                this.f39122e.setEnabled(true);
            } else {
                this.f39122e.setImageBitmap(this.f39126i.get("BACK").f36851a);
                this.f39122e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f39120c.setImageBitmap(this.f39126i.get("FORWARD_DARK").f36851a);
                this.f39120c.setEnabled(true);
            } else {
                this.f39120c.setImageBitmap(this.f39126i.get("FORWARD").f36851a);
                this.f39120c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f39123f.setText(webView.getTitle());
            }
        } else if (webView.canGoBack()) {
            this.f39122e.setImageBitmap(this.f39126i.get("BACK_DARK").f36851a);
            addView(this.f39122e, C9265rb.m49235a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            ImageView imageView = this.f39120c;
            RelativeLayout.LayoutParams a = C9265rb.m49235a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a.addRule(1, 2105);
            addView(imageView, a);
            removeView(this.f39118a);
            this.f39118a.removeView(this.f39124g);
            this.f39118a.removeView(this.f39123f);
            this.f39118a.addView(this.f39123f, C9265rb.m49235a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f39118a;
            TextView textView = this.f39124g;
            RelativeLayout.LayoutParams a2 = C9265rb.m49235a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a2.addRule(3, 2102);
            relativeLayout.addView(textView, a2);
            RelativeLayout.LayoutParams a3 = C9265rb.m49235a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a3.addRule(1, 2106);
            a3.addRule(0, 2104);
            addView(this.f39118a, a3);
            this.f39125h = Boolean.TRUE;
        }
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f39119b.setOnClickListener(onClickListener);
        this.f39122e.setOnClickListener(onClickListener);
        this.f39120c.setOnClickListener(onClickListener);
        this.f39121d.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo31196a() {
        if (Build.VERSION.SDK_INT < 11) {
            ((BitmapDrawable) this.f39119b.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f39121d.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f39122e.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f39120c.getDrawable()).getBitmap().recycle();
        }
        this.f39126i = null;
    }
}
