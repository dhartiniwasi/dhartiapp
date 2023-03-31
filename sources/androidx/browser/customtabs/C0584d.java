package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.browser.customtabs.C0574a;
import androidx.core.app.C0632f;
import androidx.core.content.C0681a;
import java.util.ArrayList;

/* renamed from: androidx.browser.customtabs.d */
/* compiled from: CustomTabsIntent */
public final class C0584d {

    /* renamed from: a */
    public final Intent f1914a;

    /* renamed from: b */
    public final Bundle f1915b;

    C0584d(Intent intent, Bundle bundle) {
        this.f1914a = intent;
        this.f1915b = bundle;
    }

    /* renamed from: a */
    public void mo2686a(Context context, Uri uri) {
        this.f1914a.setData(uri);
        C0681a.m3157m(context, this.f1914a, this.f1915b);
    }

    /* renamed from: androidx.browser.customtabs.d$a */
    /* compiled from: CustomTabsIntent */
    public static final class C0585a {

        /* renamed from: a */
        private final Intent f1916a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C0574a.C0575a f1917b = new C0574a.C0575a();

        /* renamed from: c */
        private ArrayList<Bundle> f1918c;

        /* renamed from: d */
        private Bundle f1919d;

        /* renamed from: e */
        private ArrayList<Bundle> f1920e;

        /* renamed from: f */
        private SparseArray<Bundle> f1921f;

        /* renamed from: g */
        private Bundle f1922g;

        /* renamed from: h */
        private int f1923h = 0;

        /* renamed from: i */
        private boolean f1924i = true;

        public C0585a() {
        }

        /* renamed from: g */
        private void m2748g(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0632f.m2961b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1916a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0585a mo2687a(String str, PendingIntent pendingIntent) {
            if (this.f1918c == null) {
                this.f1918c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1918c.add(bundle);
            return this;
        }

        /* renamed from: b */
        public C0584d mo2688b() {
            if (!this.f1916a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m2748g((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f1918c;
            if (arrayList != null) {
                this.f1916a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1920e;
            if (arrayList2 != null) {
                this.f1916a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1916a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1924i);
            this.f1916a.putExtras(this.f1917b.mo2665a().mo2664a());
            Bundle bundle = this.f1922g;
            if (bundle != null) {
                this.f1916a.putExtras(bundle);
            }
            if (this.f1921f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1921f);
                this.f1916a.putExtras(bundle2);
            }
            this.f1916a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1923h);
            return new C0584d(this.f1916a, this.f1919d);
        }

        /* renamed from: c */
        public C0585a mo2689c(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1916a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f1916a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z);
            return this;
        }

        /* renamed from: d */
        public C0585a mo2690d(C0574a aVar) {
            this.f1922g = aVar.mo2664a();
            return this;
        }

        /* renamed from: e */
        public C0585a mo2691e(boolean z) {
            this.f1924i = z;
            return this;
        }

        /* renamed from: f */
        public C0585a mo2692f(C0588f fVar) {
            this.f1916a.setPackage(fVar.mo2701d().getPackageName());
            m2748g(fVar.mo2700c(), fVar.mo2702e());
            return this;
        }

        /* renamed from: h */
        public C0585a mo2693h(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1923h = i;
            if (i == 1) {
                this.f1916a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i == 2) {
                this.f1916a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1916a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        /* renamed from: i */
        public C0585a mo2694i(boolean z) {
            this.f1916a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: j */
        public C0585a mo2695j(boolean z) {
            this.f1916a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
            return this;
        }

        public C0585a(C0588f fVar) {
            if (fVar != null) {
                mo2692f(fVar);
            }
        }
    }
}
