package com.startapp;

import android.content.Context;
import com.startapp.networkTest.enums.CtTestTypes;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.startapp.c5 */
/* compiled from: Sta */
public class C8877c5 implements X509TrustManager {

    /* renamed from: e */
    private static final boolean f36571e = false;

    /* renamed from: f */
    private static final String f36572f = C8877c5.class.getSimpleName();

    /* renamed from: g */
    private static String f36573g = "";

    /* renamed from: h */
    private static boolean f36574h = false;

    /* renamed from: i */
    private static X509TrustManager f36575i = null;

    /* renamed from: j */
    private static X509TrustManager f36576j = null;

    /* renamed from: k */
    private static final String f36577k = "R_hqKukfFZxKn52";

    /* renamed from: l */
    private static final X509TrustManager f36578l = new C8878a();

    /* renamed from: a */
    private X509TrustManager[] f36579a;

    /* renamed from: b */
    private CtTestTypes[] f36580b;

    /* renamed from: c */
    private String f36581c = "";

    /* renamed from: d */
    private CtTestTypes f36582d = CtTestTypes.Unknown;

    /* renamed from: com.startapp.c5$a */
    /* compiled from: Sta */
    public class C8878a implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public C8877c5(Context context, boolean z) {
        m48430a(context, z);
        X509TrustManager[] x509TrustManagerArr = new X509TrustManager[3];
        this.f36579a = x509TrustManagerArr;
        CtTestTypes[] ctTestTypesArr = new CtTestTypes[3];
        this.f36580b = ctTestTypesArr;
        x509TrustManagerArr[0] = f36575i;
        ctTestTypesArr[0] = CtTestTypes.SSLOwnTs;
        x509TrustManagerArr[1] = f36576j;
        ctTestTypesArr[1] = CtTestTypes.SSLDeviceTs;
        x509TrustManagerArr[2] = f36578l;
        ctTestTypesArr[2] = CtTestTypes.SSLTrustAll;
        this.f36581c = f36573g;
    }

    /* renamed from: a */
    public String mo29245a() {
        return this.f36581c;
    }

    /* renamed from: b */
    public CtTestTypes mo29246b() {
        return this.f36582d;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        int i = 0;
        while (true) {
            X509TrustManager[] x509TrustManagerArr = this.f36579a;
            if (i < x509TrustManagerArr.length) {
                X509TrustManager x509TrustManager = x509TrustManagerArr[i];
                if (x509TrustManager != null) {
                    try {
                        this.f36582d = this.f36580b[i];
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        return;
                    } catch (CertificateException e) {
                        if (i == 0) {
                            this.f36581c += e.getMessage();
                        }
                        if (i + 1 == this.f36579a.length) {
                            throw e;
                        }
                    }
                } else {
                    i++;
                }
            } else {
                return;
            }
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f36576j.getAcceptedIssuers();
    }

    /* renamed from: a */
    private void m48430a(Context context, boolean z) {
        if (!f36574h || z) {
            synchronized (C8877c5.class) {
                if (!f36574h || z) {
                    f36573g = "";
                    int i = 0;
                    try {
                        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        instance.init((KeyStore) null);
                        TrustManager[] trustManagers = instance.getTrustManagers();
                        int length = trustManagers.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            TrustManager trustManager = trustManagers[i2];
                            if (trustManager instanceof X509TrustManager) {
                                f36576j = (X509TrustManager) trustManager;
                                break;
                            }
                            i2++;
                        }
                    } catch (Throwable th) {
                        C9632x2.m50510a(th);
                        f36573g += th.getMessage();
                    }
                    try {
                        File c = C9155nb.m48999c(context);
                        File d = C9155nb.m49000d(context);
                        if (!c.exists() || !d.exists()) {
                            throw new KeyStoreException("Downloaded truststore not available");
                        }
                        if (C8821a5.m48254b().CONNECTIVITY_TEST_VERIFY_TRUSTSTORE_SIGNATURE() ? C9155nb.m48997a(c, d) : true) {
                            FileInputStream fileInputStream = new FileInputStream(c);
                            KeyStore instance2 = KeyStore.getInstance("BKS");
                            instance2.load(fileInputStream, f36577k.toCharArray());
                            fileInputStream.close();
                            TrustManagerFactory instance3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            instance3.init(instance2);
                            TrustManager[] trustManagers2 = instance3.getTrustManagers();
                            int length2 = trustManagers2.length;
                            while (true) {
                                if (i >= length2) {
                                    break;
                                }
                                TrustManager trustManager2 = trustManagers2[i];
                                if (trustManager2 instanceof X509TrustManager) {
                                    f36575i = (X509TrustManager) trustManager2;
                                    break;
                                }
                                i++;
                            }
                            f36574h = true;
                            return;
                        }
                        throw new KeyStoreException("Verification of downloaded truststore failed");
                    } catch (Throwable th2) {
                        C9632x2.m50510a(th2);
                        f36573g += th2.getMessage();
                    }
                } else {
                    return;
                }
            }
        } else {
            return;
        }
    }
}
