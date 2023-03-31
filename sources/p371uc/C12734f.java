package p371uc;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: uc.f */
/* compiled from: OkHostnameVerifier */
public final class C12734f implements HostnameVerifier {

    /* renamed from: a */
    public static final C12734f f46651a = new C12734f();

    /* renamed from: b */
    private static final Pattern f46652b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C12734f() {
    }

    /* renamed from: a */
    private static List<String> m60386a(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    static boolean m60387c(String str) {
        return f46652b.matcher(str).matches();
    }

    /* renamed from: d */
    private boolean m60388d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m60389e(String str, X509Certificate x509Certificate) {
        String b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> a = m60386a(x509Certificate, 2);
        int size = a.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (m60388d(lowerCase, a.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (b = new C12730d(x509Certificate.getSubjectX500Principal()).mo37642b("cn")) == null) {
            return false;
        }
        return m60388d(lowerCase, b);
    }

    /* renamed from: f */
    private boolean m60390f(String str, X509Certificate x509Certificate) {
        List<String> a = m60386a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo37651b(String str, X509Certificate x509Certificate) {
        if (m60387c(str)) {
            return m60390f(str, x509Certificate);
        }
        return m60389e(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo37651b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
