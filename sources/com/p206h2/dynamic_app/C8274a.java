package com.p206h2.dynamic_app;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.dharti.app1008375896272.R;
import com.google.android.gms.ads.nativead.C2043a;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.Map;
import p264io.flutter.plugins.googlemobileads.C10839h0;

/* renamed from: com.h2.dynamic_app.a */
/* compiled from: NativeAdmobFactory */
public class C8274a implements C10839h0.C10842c {

    /* renamed from: a */
    private final LayoutInflater f35241a;

    C8274a(LayoutInflater layoutInflater) {
        this.f35241a = layoutInflater;
    }

    /* renamed from: a */
    public NativeAdView mo27481a(C2043a aVar, Map<String, Object> map) {
        NativeAdView nativeAdView = (NativeAdView) this.f35241a.inflate(R.layout.native_ad, (ViewGroup) null);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_headline);
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_advertiser);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body);
        TextView textView4 = (TextView) nativeAdView.findViewById(R.id.ad_price);
        TextView textView5 = (TextView) nativeAdView.findViewById(R.id.ad_store);
        TextView textView6 = (TextView) nativeAdView.findViewById(R.id.ad_attribution);
        RatingBar ratingBar = (RatingBar) nativeAdView.findViewById(R.id.ad_stars);
        Button button = (Button) nativeAdView.findViewById(R.id.ad_call_to_action);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.ad_icon);
        nativeAdView.setMediaView(mediaView);
        nativeAdView.setHeadlineView(textView);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(button);
        nativeAdView.setIconView(imageView);
        nativeAdView.setPriceView(textView4);
        nativeAdView.setStarRatingView(ratingBar);
        nativeAdView.setStoreView(textView5);
        nativeAdView.setAdvertiserView(textView2);
        if (aVar.mo7910f() != null) {
            mediaView.setMediaContent(aVar.mo7910f());
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            mediaView.setVisibility(0);
        } else {
            mediaView.setVisibility(4);
        }
        textView.setText(aVar.mo7908d());
        textView3.setText(aVar.mo7906b());
        button.setText(aVar.mo7907c());
        button.setText(aVar.mo7907c());
        if (aVar.mo7909e() != null) {
            imageView.setImageDrawable(aVar.mo7909e().mo7917a());
        } else {
            imageView.setVisibility(4);
        }
        if (aVar.mo7911g() != null) {
            textView4.setText(aVar.mo7911g());
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(4);
        }
        if (aVar.mo7914j() == null) {
            textView5.setVisibility(4);
        } else {
            textView5.setVisibility(0);
            textView5.setText(aVar.mo7914j());
        }
        if (aVar.mo7913i() == null) {
            ratingBar.setVisibility(4);
        } else {
            ratingBar.setVisibility(0);
            ratingBar.setRating(aVar.mo7913i().floatValue());
        }
        if (aVar.mo7905a() == null) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            textView2.setText(aVar.mo7905a());
        }
        nativeAdView.setNativeAd(aVar);
        return nativeAdView;
    }
}
