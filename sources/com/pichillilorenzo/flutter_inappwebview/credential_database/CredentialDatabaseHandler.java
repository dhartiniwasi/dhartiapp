package com.pichillilorenzo.flutter_inappwebview.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6555j;
import p186ac.C6556k;

public class CredentialDatabaseHandler implements C6556k.C6560c {
    static final String LOG_TAG = "CredentialDatabaseHandler";
    public static CredentialDatabase credentialDatabase;
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_credential_database");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        Context context;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1851697792:
                if (str.equals("clearAllAuthCredentials")) {
                    c = 0;
                    break;
                }
                break;
            case -410271914:
                if (str.equals("getHttpAuthCredentials")) {
                    c = 1;
                    break;
                }
                break;
            case 589173355:
                if (str.equals("removeHttpAuthCredential")) {
                    c = 2;
                    break;
                }
                break;
            case 998955721:
                if (str.equals("setHttpAuthCredential")) {
                    c = 3;
                    break;
                }
                break;
            case 1084504936:
                if (str.equals("removeHttpAuthCredentials")) {
                    c = 4;
                    break;
                }
                break;
            case 1930845769:
                if (str.equals("getAllAuthCredentials")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                credentialDatabase.clearAllAuthCredentials();
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (!(inAppWebViewFlutterPlugin2 == null || (context = inAppWebViewFlutterPlugin2.applicationContext) == null)) {
                    WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                }
                dVar.success(Boolean.TRUE);
                return;
            case 1:
                ArrayList arrayList = new ArrayList();
                for (URLCredential map : credentialDatabase.getHttpAuthCredentials((String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))) {
                    arrayList.add(map.toMap());
                }
                dVar.success(arrayList);
                return;
            case 2:
                credentialDatabase.removeHttpAuthCredential((String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) jVar.mo22156a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) jVar.mo22156a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                dVar.success(Boolean.TRUE);
                return;
            case 3:
                credentialDatabase.setHttpAuthCredential((String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) jVar.mo22156a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) jVar.mo22156a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                dVar.success(Boolean.TRUE);
                return;
            case 4:
                credentialDatabase.removeHttpAuthCredentials((String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.mo22156a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                dVar.success(Boolean.TRUE);
                return;
            case 5:
                ArrayList arrayList2 = new ArrayList();
                for (URLProtectionSpace next : credentialDatabase.protectionSpaceDao.getAll()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (URLCredential map2 : credentialDatabase.credentialDao.getAllByProtectionSpaceId(next.getId())) {
                        arrayList3.add(map2.toMap());
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("protectionSpace", next.toMap());
                    hashMap.put("credentials", arrayList3);
                    arrayList2.add(hashMap);
                }
                dVar.success(arrayList2);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
