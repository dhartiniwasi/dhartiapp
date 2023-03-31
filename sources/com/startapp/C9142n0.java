package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.startapp.C8960g1;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.n0 */
/* compiled from: Sta */
public class C9142n0 implements C8960g1.C8963b, Parcelable {
    public static final Parcelable.Creator<C9142n0> CREATOR = new C9143a();

    /* renamed from: a */
    public AdDetails f37327a;

    /* renamed from: b */
    public Point f37328b;

    /* renamed from: c */
    public Bitmap f37329c = null;

    /* renamed from: d */
    public Bitmap f37330d = null;

    /* renamed from: e */
    public AtomicBoolean f37331e = new AtomicBoolean(false);

    /* renamed from: f */
    public TrackingParams f37332f;

    /* renamed from: g */
    public C9087k9 f37333g = null;

    /* renamed from: h */
    public Banner3DView f37334h = null;

    /* renamed from: com.startapp.n0$a */
    /* compiled from: Sta */
    public class C9143a implements Parcelable.Creator<C9142n0> {
        public Object createFromParcel(Parcel parcel) {
            return new C9142n0(parcel);
        }

        public Object[] newArray(int i) {
            return new C9142n0[i];
        }
    }

    public C9142n0(Context context, ViewGroup viewGroup, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f37327a = adDetails;
        this.f37332f = trackingParams;
        mo29706a(context, bannerOptions, viewGroup);
    }

    /* renamed from: a */
    public void mo29706a(Context context, BannerOptions bannerOptions, ViewGroup viewGroup) {
        int a = C9124m0.m48952a(context, 1, (float) (bannerOptions.mo29965d() - 5));
        this.f37328b = new Point((int) (bannerOptions.mo29979p() * ((float) C9124m0.m48952a(context, 1, (float) bannerOptions.mo29978o()))), (int) (bannerOptions.mo29966e() * ((float) C9124m0.m48952a(context, 1, (float) bannerOptions.mo29965d()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.mo29978o(), bannerOptions.mo29965d()));
        this.f37334h = banner3DView;
        banner3DView.setText(this.f37327a.mo30847t());
        this.f37334h.setRating(this.f37327a.mo30844q());
        this.f37334h.setDescription(this.f37327a.mo30836i());
        this.f37334h.setButtonText(this.f37327a.mo30855z());
        Bitmap bitmap = this.f37329c;
        if (bitmap != null) {
            this.f37334h.setImage(bitmap, a, a);
        } else {
            this.f37334h.setImage(17301651, a, a);
            new C8960g1(context, this.f37327a.mo30837j(), this, 0).mo29368a();
        }
        Point point = this.f37328b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        viewGroup.addView(this.f37334h, layoutParams);
        this.f37334h.setVisibility(8);
        mo29705a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37327a, i);
        parcel.writeInt(this.f37328b.x);
        parcel.writeInt(this.f37328b.y);
        parcel.writeParcelable(this.f37329c, i);
        parcel.writeBooleanArray(new boolean[]{this.f37331e.get()});
        parcel.writeSerializable(this.f37332f);
    }

    public C9142n0(Parcel parcel) {
        this.f37327a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f37328b = point;
        point.x = parcel.readInt();
        this.f37328b.y = parcel.readInt();
        this.f37329c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f37331e.set(zArr[0]);
        this.f37332f = (TrackingParams) parcel.readSerializable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r1 = r4.f37328b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29705a() {
        /*
            r4 = this;
            com.startapp.sdk.ads.banner.banner3d.Banner3DView r0 = r4.f37334h
            if (r0 == 0) goto L_0x000d
            android.graphics.Bitmap r0 = m48982a(r0)     // Catch:{ OutOfMemoryError -> 0x000d, all -> 0x0009 }
            goto L_0x000e
        L_0x0009:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
        L_0x000d:
            r0 = 0
        L_0x000e:
            r4.f37330d = r0
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            android.graphics.Point r1 = r4.f37328b
            int r2 = r1.x
            if (r2 <= 0) goto L_0x0024
            int r1 = r1.y
            if (r1 <= 0) goto L_0x0024
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r1, r3)
            r4.f37330d = r0
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9142n0.mo29705a():void");
    }

    /* renamed from: a */
    public static Bitmap m48982a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public void mo29358a(Bitmap bitmap, int i) {
        Banner3DView banner3DView;
        if (bitmap != null && (banner3DView = this.f37334h) != null) {
            this.f37329c = bitmap;
            banner3DView.setImage(bitmap);
            mo29705a();
        }
    }
}
