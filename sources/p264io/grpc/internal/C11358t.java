package p264io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import p182a7.C6425j;
import p182a7.C6431n;
import p343rc.C12271a;
import p343rc.C12294c0;
import p343rc.C12312f;

/* renamed from: io.grpc.internal.t */
/* compiled from: ClientTransportFactory */
public interface C11358t extends Closeable {

    /* renamed from: io.grpc.internal.t$a */
    /* compiled from: ClientTransportFactory */
    public static final class C11359a {

        /* renamed from: a */
        private String f43609a = "unknown-authority";

        /* renamed from: b */
        private C12271a f43610b = C12271a.f45491c;

        /* renamed from: c */
        private String f43611c;

        /* renamed from: d */
        private C12294c0 f43612d;

        /* renamed from: a */
        public String mo35331a() {
            return this.f43609a;
        }

        /* renamed from: b */
        public C12271a mo35332b() {
            return this.f43610b;
        }

        /* renamed from: c */
        public C12294c0 mo35333c() {
            return this.f43612d;
        }

        /* renamed from: d */
        public String mo35334d() {
            return this.f43611c;
        }

        /* renamed from: e */
        public C11359a mo35335e(String str) {
            this.f43609a = (String) C6431n.m37562o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11359a)) {
                return false;
            }
            C11359a aVar = (C11359a) obj;
            if (!this.f43609a.equals(aVar.f43609a) || !this.f43610b.equals(aVar.f43610b) || !C6425j.m37541a(this.f43611c, aVar.f43611c) || !C6425j.m37541a(this.f43612d, aVar.f43612d)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public C11359a mo35337f(C12271a aVar) {
            C6431n.m37562o(aVar, "eagAttributes");
            this.f43610b = aVar;
            return this;
        }

        /* renamed from: g */
        public C11359a mo35338g(C12294c0 c0Var) {
            this.f43612d = c0Var;
            return this;
        }

        /* renamed from: h */
        public C11359a mo35339h(String str) {
            this.f43611c = str;
            return this;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f43609a, this.f43610b, this.f43611c, this.f43612d);
        }
    }

    void close();

    /* renamed from: h0 */
    C11376v mo35234h0(SocketAddress socketAddress, C11359a aVar, C12312f fVar);

    /* renamed from: n1 */
    ScheduledExecutorService mo35235n1();
}
