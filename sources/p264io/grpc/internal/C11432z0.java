package p264io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import p264io.grpc.internal.C11138c0;

/* renamed from: io.grpc.internal.z0 */
/* compiled from: JndiResourceResolverFactory */
final class C11432z0 implements C11138c0.C11146g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Throwable f43777a = m56105d();

    /* renamed from: io.grpc.internal.z0$a */
    /* compiled from: JndiResourceResolverFactory */
    static final class C11433a implements C11435c {
        C11433a() {
        }

        /* renamed from: b */
        private static void m56108b() {
            if (C11432z0.f43777a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", C11432z0.f43777a);
            }
        }

        /* renamed from: c */
        private static void m56109c(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: d */
        private static void m56110d(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: a */
        public List<String> mo35432a(String str, String str2) throws NamingException {
            m56108b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                m56109c(all2, e);
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        m56109c(all, e2);
                    }
                }
                all.close();
            } catch (NamingException e3) {
                m56110d(initialDirContext, e3);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* renamed from: io.grpc.internal.z0$b */
    /* compiled from: JndiResourceResolverFactory */
    static final class C11434b implements C11138c0.C11145f {

        /* renamed from: b */
        private static final Logger f43778b = Logger.getLogger(C11434b.class.getName());

        /* renamed from: c */
        private static final Pattern f43779c = Pattern.compile("\\s+");

        /* renamed from: a */
        private final C11435c f43780a;

        public C11434b(C11435c cVar) {
            this.f43780a = cVar;
        }

        /* renamed from: b */
        static String m56112b(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i = 0;
            boolean z = false;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (!z) {
                    if (charAt != ' ') {
                        if (charAt == '\"') {
                            z = true;
                        }
                    }
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                    i++;
                } else if (charAt == '\\') {
                    i++;
                    charAt = str.charAt(i);
                }
                sb.append(charAt);
                i++;
            }
            return sb.toString();
        }

        /* renamed from: a */
        public List<String> mo34997a(String str) throws NamingException {
            Logger logger = f43778b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            C11435c cVar = this.f43780a;
            List<String> a = cVar.mo35432a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a.size())});
            }
            ArrayList arrayList = new ArrayList(a.size());
            for (String b : a) {
                arrayList.add(m56112b(b));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* renamed from: io.grpc.internal.z0$c */
    /* compiled from: JndiResourceResolverFactory */
    interface C11435c {
        /* renamed from: a */
        List<String> mo35432a(String str, String str2) throws NamingException;
    }

    /* renamed from: d */
    private static Throwable m56105d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e) {
            return e;
        } catch (RuntimeException e2) {
            return e2;
        } catch (Error e3) {
            return e3;
        }
    }

    /* renamed from: a */
    public C11138c0.C11145f mo34998a() {
        if (mo34999b() != null) {
            return null;
        }
        return new C11434b(new C11433a());
    }

    /* renamed from: b */
    public Throwable mo34999b() {
        return f43777a;
    }
}
