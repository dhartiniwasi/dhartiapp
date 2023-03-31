package p288lb;

import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.HashMap;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: lb.b */
/* compiled from: MethodCallHandlerImpl */
class C11782b implements C6556k.C6560c {

    /* renamed from: b */
    private static final String[] f44425b = new String[0];

    /* renamed from: a */
    private final PackageManager f44426a;

    C11782b(ContentResolver contentResolver, PackageManager packageManager) {
        this.f44426a = packageManager;
    }

    /* renamed from: a */
    private String[] m57117a() {
        FeatureInfo[] systemAvailableFeatures = this.f44426a.getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            return f44425b;
        }
        String[] strArr = new String[systemAvailableFeatures.length];
        for (int i = 0; i < systemAvailableFeatures.length; i++) {
            strArr[i] = systemAvailableFeatures[i].name;
        }
        return strArr;
    }

    /* renamed from: b */
    private boolean m57118b() {
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        return str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator");
                    }
                }
            }
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.equals("getAndroidDeviceInfo")) {
            HashMap hashMap = new HashMap();
            hashMap.put("board", Build.BOARD);
            hashMap.put("bootloader", Build.BOOTLOADER);
            hashMap.put("brand", Build.BRAND);
            hashMap.put("device", Build.DEVICE);
            hashMap.put("display", Build.DISPLAY);
            hashMap.put("fingerprint", Build.FINGERPRINT);
            hashMap.put("hardware", Build.HARDWARE);
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
            hashMap.put("id", Build.ID);
            hashMap.put("manufacturer", Build.MANUFACTURER);
            hashMap.put("model", Build.MODEL);
            hashMap.put("product", Build.PRODUCT);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
                hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
                hashMap.put("supportedAbis", Arrays.asList(Build.SUPPORTED_ABIS));
            } else {
                String[] strArr = f44425b;
                hashMap.put("supported32BitAbis", Arrays.asList(strArr));
                hashMap.put("supported64BitAbis", Arrays.asList(strArr));
                hashMap.put("supportedAbis", Arrays.asList(strArr));
            }
            hashMap.put("tags", Build.TAGS);
            hashMap.put("type", Build.TYPE);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!m57118b()));
            hashMap.put("systemFeatures", Arrays.asList(m57117a()));
            HashMap hashMap2 = new HashMap();
            if (i >= 23) {
                hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
            }
            hashMap2.put("codename", Build.VERSION.CODENAME);
            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
            hashMap2.put("release", Build.VERSION.RELEASE);
            hashMap2.put("sdkInt", Integer.valueOf(i));
            hashMap.put(MediationMetaData.KEY_VERSION, hashMap2);
            dVar.success(hashMap);
            return;
        }
        dVar.notImplemented();
    }
}
