package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.C8897d;
import com.startapp.C8923e2;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class AdInformationObject implements View.OnClickListener {

    /* renamed from: a */
    public final WeakReference<Context> f38719a;

    /* renamed from: b */
    public final AdInformationView f38720b;

    /* renamed from: c */
    public final AdPreferences.Placement f38721c;

    /* renamed from: d */
    public final ConsentData f38722d;

    /* renamed from: e */
    public final String f38723e;

    /* renamed from: f */
    public final String f38724f;

    /* renamed from: g */
    public final AdInformationOverrides f38725g;

    /* compiled from: Sta */
    public enum Size {
        SMALL(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S),
        LARGE(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);
        
        private final AdInformationConfig.ImageResourceType infoExtendedType;
        private final AdInformationConfig.ImageResourceType infoType;

        /* access modifiers changed from: public */
        Size(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        /* renamed from: a */
        public AdInformationConfig.ImageResourceType mo30610a() {
            return this.infoType;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.adinformation.AdInformationObject$a */
    /* compiled from: Sta */
    public class C9397a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C8897d f38729a;

        public C9397a(C8897d dVar) {
            this.f38729a = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[Catch:{ all -> 0x00ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[Catch:{ all -> 0x00ad }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.startapp.d r8 = r7.f38729a
                com.startapp.sdk.adsbase.adinformation.AdInformationObject r0 = com.startapp.sdk.adsbase.adinformation.AdInformationObject.this
                java.lang.String r1 = r0.f38723e
                java.lang.String r0 = r0.f38724f
                com.startapp.d3<com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata> r2 = r8.f36661c
                java.lang.Object r2 = r2.call()
                com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata r2 = (com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata) r2
                if (r2 == 0) goto L_0x002a
                boolean r2 = r2.mo30913b()
                if (r2 == 0) goto L_0x002a
                com.startapp.i4 r2 = new com.startapp.i4
                com.startapp.j4 r3 = com.startapp.C9043j4.f36993d
                r2.<init>((com.startapp.C9043j4) r3)
                java.lang.String r3 = "adDebugInfo"
                r2.f36952d = r3
                r2.f36953e = r1
                r2.f36955g = r0
                r2.mo29471a()
            L_0x002a:
                java.lang.String r2 = "Ad debug info"
                r3 = 0
                if (r1 != 0) goto L_0x004c
                if (r0 != 0) goto L_0x004c
                android.content.Context r8 = r8.f36659a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r1 = " not available"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r3)
                r8.show()
                goto L_0x00ad
            L_0x004c:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r2)
                java.lang.String r5 = "\n"
                r4.append(r5)
                if (r1 == 0) goto L_0x0061
                java.lang.String r6 = "url: "
                r4.append(r6)
                r4.append(r1)
                goto L_0x0063
            L_0x0061:
                java.lang.String r5 = ""
            L_0x0063:
                if (r0 == 0) goto L_0x0070
                r4.append(r5)
                java.lang.String r1 = "d: "
                r4.append(r1)
                r4.append(r0)
            L_0x0070:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 11
                if (r0 < r1) goto L_0x008d
                android.content.Context r0 = r8.f36659a     // Catch:{ all -> 0x008d }
                java.lang.String r1 = "clipboard"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x008d }
                boolean r1 = r0 instanceof android.content.ClipboardManager     // Catch:{ all -> 0x008d }
                if (r1 == 0) goto L_0x008d
                android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ all -> 0x008d }
                android.content.ClipData r1 = android.content.ClipData.newPlainText(r2, r4)     // Catch:{ all -> 0x008d }
                r0.setPrimaryClip(r1)     // Catch:{ all -> 0x008d }
                r0 = 1
                goto L_0x008e
            L_0x008d:
                r0 = 0
            L_0x008e:
                android.content.Context r8 = r8.f36659a     // Catch:{ all -> 0x00ad }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
                r1.<init>()     // Catch:{ all -> 0x00ad }
                r1.append(r2)     // Catch:{ all -> 0x00ad }
                if (r0 == 0) goto L_0x009d
                java.lang.String r0 = " copied to clipboard"
                goto L_0x009f
            L_0x009d:
                java.lang.String r0 = " printed to logcat"
            L_0x009f:
                r1.append(r0)     // Catch:{ all -> 0x00ad }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ad }
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r3)     // Catch:{ all -> 0x00ad }
                r8.show()     // Catch:{ all -> 0x00ad }
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.adinformation.AdInformationObject.C9397a.onClick(android.view.View):void");
        }
    }

    public AdInformationObject(Context context, Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2) {
        this.f38719a = new WeakReference<>(context);
        this.f38721c = placement;
        this.f38725g = adInformationOverrides;
        this.f38722d = consentData;
        this.f38723e = str;
        this.f38724f = str2;
        this.f38720b = new AdInformationView(context, size, placement, adInformationOverrides, this);
    }

    /* renamed from: a */
    public void mo30608a(RelativeLayout relativeLayout) {
        boolean z;
        Context context = relativeLayout.getContext();
        AdInformationConfig a = AdInformationMetaData.f38717a.mo30603a();
        AdInformationOverrides adInformationOverrides = this.f38725g;
        if (adInformationOverrides == null || !adInformationOverrides.mo30616d()) {
            z = a.mo30595b(context);
        } else {
            z = this.f38725g.mo30615c();
        }
        if (z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f38725g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.mo30617e()) {
                AdPreferences.Placement placement = this.f38721c;
                AdInformationPositions.Position position = a.Positions.get(placement);
                if (position == null) {
                    position = AdInformationPositions.Position.BOTTOM_LEFT;
                    a.Positions.put(placement, position);
                }
                position.addRules(layoutParams);
            } else {
                this.f38725g.mo30614b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f38720b, layoutParams);
        }
        C8897d a2 = ComponentLocator.m50248a(context).f39031K.mo29904a();
        if (a2.mo29286a()) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, ((float) (this.f38720b.mo30624c() * 2)) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new C9397a(a2));
            AdInformationPositions.Position position2 = this.f38720b.f38738f;
            if (position2 == null) {
                position2 = AdInformationPositions.Position.BOTTOM_LEFT;
            }
            AdInformationPositions.Position flipHorizontal = position2.flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f38720b.mo30625d(), this.f38720b.mo30624c());
            layoutParams2.setMargins(0, 0, 0, 0);
            flipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            AdInformationView adInformationView = this.f38720b;
            float e = adInformationView.f38736d.mo30598e();
            AdInformationView adInformationView2 = this.f38720b;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) (e * ((float) adInformationView.mo30625d())), (int) (adInformationView2.f38736d.mo30598e() * ((float) adInformationView2.mo30624c())));
            flipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    public void onClick(View view) {
        Context context = (Context) this.f38719a.get();
        if (context != null) {
            C8923e2 f = ComponentLocator.m50248a(context).mo31170f();
            ConsentData consentData = this.f38722d;
            String str = null;
            String c = consentData != null ? consentData.mo30752c() : null;
            ConsentData consentData2 = this.f38722d;
            String d = consentData2 != null ? consentData2.mo30754d() : null;
            ConsentData consentData3 = this.f38722d;
            if (consentData3 != null) {
                str = consentData3.mo30750b();
            }
            f.mo29322a(true, c, d, str);
        }
    }
}
