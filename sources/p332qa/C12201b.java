package p332qa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.C1252a;
import androidx.media.C1259b;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: qa.b */
/* compiled from: AndroidAudioManager */
public class C12201b implements C6556k.C6560c {

    /* renamed from: c */
    private static C12202a f45304c;

    /* renamed from: a */
    private C6539c f45305a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6556k f45306b;

    /* renamed from: qa.b$a */
    /* compiled from: AndroidAudioManager */
    private static class C12202a {

        /* renamed from: a */
        private final Handler f45307a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private List<C12201b> f45308b = new ArrayList();

        /* renamed from: c */
        private C1252a f45309c;

        /* renamed from: d */
        private BroadcastReceiver f45310d;

        /* renamed from: e */
        private BroadcastReceiver f45311e;

        /* renamed from: f */
        private Context f45312f;

        /* renamed from: g */
        private AudioManager f45313g;

        /* renamed from: h */
        private Object f45314h;

        /* renamed from: i */
        private List<AudioDeviceInfo> f45315i = new ArrayList();

        /* renamed from: qa.b$a$a */
        /* compiled from: AndroidAudioManager */
        class C12203a extends AudioDeviceCallback {
            C12203a() {
            }

            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                C12202a.this.m58616v0("onAudioDevicesAdded", C12202a.m58584f0(audioDeviceInfoArr));
            }

            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                C12202a.this.m58616v0("onAudioDevicesRemoved", C12202a.m58584f0(audioDeviceInfoArr));
            }
        }

        /* renamed from: qa.b$a$b */
        /* compiled from: AndroidAudioManager */
        class C12204b extends BroadcastReceiver {
            C12204b() {
            }

            public void onReceive(Context context, Intent intent) {
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    C12202a.this.m58616v0("onBecomingNoisy", new Object[0]);
                }
            }
        }

        /* renamed from: qa.b$a$c */
        /* compiled from: AndroidAudioManager */
        class C12205c extends BroadcastReceiver {
            C12205c() {
            }

            public void onReceive(Context context, Intent intent) {
                C12202a.this.m58616v0("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
            }
        }

        public C12202a(Context context) {
            this.f45312f = context;
            this.f45313g = (AudioManager) context.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                m58614u0();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: A0 */
        public Object m58525A0() {
            return Boolean.valueOf(this.f45313g.isMicrophoneMute());
        }

        /* access modifiers changed from: private */
        /* renamed from: B0 */
        public Object m58527B0() {
            return Boolean.valueOf(this.f45313g.isMusicActive());
        }

        /* access modifiers changed from: private */
        /* renamed from: C0 */
        public Object m58529C0() {
            return Boolean.valueOf(this.f45313g.isSpeakerphoneOn());
        }

        /* access modifiers changed from: private */
        /* renamed from: D0 */
        public Object m58531D0(int i) {
            C12201b.m58522g(23);
            return Boolean.valueOf(this.f45313g.isStreamMute(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: E0 */
        public Object m58533E0() {
            C12201b.m58522g(21);
            return Boolean.valueOf(this.f45313g.isVolumeFixed());
        }

        /* access modifiers changed from: private */
        /* renamed from: F0 */
        public /* synthetic */ void m58535F0(int i) {
            if (i == -1) {
                m58576b();
            }
            m58616v0("onAudioFocusChanged", Integer.valueOf(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: G0 */
        public Object m58537G0() {
            this.f45313g.loadSoundEffects();
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: H0 */
        public Object m58539H0(int i, Double d) {
            if (d != null) {
                this.f45313g.playSoundEffect(i, (float) d.doubleValue());
                return null;
            }
            this.f45313g.playSoundEffect(i);
            return null;
        }

        /* renamed from: I0 */
        private void m58541I0() {
            if (this.f45310d == null) {
                C12204b bVar = new C12204b();
                this.f45310d = bVar;
                this.f45312f.registerReceiver(bVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }
        }

        /* renamed from: J0 */
        private void m58543J0() {
            if (this.f45311e == null) {
                C12205c cVar = new C12205c();
                this.f45311e = cVar;
                this.f45312f.registerReceiver(cVar, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: L0 */
        public boolean m58546L0(List<?> list) {
            boolean z = true;
            if (this.f45309c != null) {
                return true;
            }
            Map map = (Map) list.get(0);
            C1252a.C1254b bVar = new C1252a.C1254b(((Integer) map.get("gainType")).intValue());
            bVar.mo4512e(new C12200a(this));
            if (map.get("audioAttributes") != null) {
                bVar.mo4510c(m58575a0((Map) map.get("audioAttributes")));
            }
            if (map.get("willPauseWhenDucked") != null) {
                bVar.mo4514g(((Boolean) map.get("willPauseWhenDucked")).booleanValue());
            }
            C1252a a = bVar.mo4509a();
            this.f45309c = a;
            if (C1259b.m5589b(this.f45313g, a) != 1) {
                z = false;
            }
            if (z) {
                m58541I0();
                m58543J0();
            }
            return z;
        }

        /* access modifiers changed from: private */
        /* renamed from: M0 */
        public Object m58548M0(int i) {
            C12201b.m58522g(29);
            this.f45313g.setAllowedCapturePolicy(i);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: N0 */
        public Object m58550N0(boolean z) {
            this.f45313g.setBluetoothScoOn(z);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: O0 */
        public boolean m58552O0(Integer num) {
            C12201b.m58522g(31);
            for (AudioDeviceInfo next : this.f45315i) {
                if (next.getId() == num.intValue()) {
                    return this.f45313g.setCommunicationDevice(next);
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: P0 */
        public Object m58554P0(boolean z) {
            this.f45313g.setMicrophoneMute(z);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: Q0 */
        public Object m58556Q0(int i) {
            this.f45313g.setMode(i);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: R0 */
        public Object m58558R0(String str) {
            this.f45313g.setParameters(str);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: S0 */
        public Object m58560S0(int i) {
            this.f45313g.setRingerMode(i);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: T0 */
        public Object m58562T0(boolean z) {
            this.f45313g.setSpeakerphoneOn(z);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: U0 */
        public Object m58564U0(int i, int i2, int i3) {
            this.f45313g.setStreamVolume(i, i2, i3);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: V0 */
        public Object m58565V0() {
            this.f45313g.startBluetoothSco();
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: W */
        public Object m58566W(int i, int i2, int i3) {
            this.f45313g.adjustStreamVolume(i, i2, i3);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: W0 */
        public Object m58567W0() {
            this.f45313g.stopBluetoothSco();
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: X */
        public Object m58568X(int i, int i2, int i3) {
            this.f45313g.adjustSuggestedStreamVolume(i, i2, i3);
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: X0 */
        public Object m58569X0() {
            this.f45313g.unloadSoundEffects();
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: Y */
        public Object m58570Y(int i, int i2) {
            this.f45313g.adjustVolume(i, i2);
            return null;
        }

        /* renamed from: Y0 */
        private void m58571Y0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f45310d;
            if (broadcastReceiver != null && (context = this.f45312f) != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.f45310d = null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: Z */
        public Object m58572Z() {
            C12201b.m58522g(31);
            this.f45313g.clearCommunicationDevice();
            return null;
        }

        /* renamed from: Z0 */
        private void m58573Z0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f45311e;
            if (broadcastReceiver != null && (context = this.f45312f) != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.f45311e = null;
            }
        }

        /* renamed from: a0 */
        private AudioAttributesCompat m58575a0(Map<?, ?> map) {
            AudioAttributesCompat.C1247a aVar = new AudioAttributesCompat.C1247a();
            if (map.get("contentType") != null) {
                aVar.mo4471b(((Integer) map.get("contentType")).intValue());
            }
            if (map.get("flags") != null) {
                aVar.mo4472c(((Integer) map.get("flags")).intValue());
            }
            if (map.get("usage") != null) {
                aVar.mo4474e(((Integer) map.get("usage")).intValue());
            }
            return aVar.mo4470a();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean m58576b() {
            if (this.f45312f == null) {
                return false;
            }
            m58571Y0();
            m58573Z0();
            C1252a aVar = this.f45309c;
            if (aVar == null) {
                return true;
            }
            int a = C1259b.m5588a(this.f45313g, aVar);
            this.f45309c = null;
            if (a == 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b0 */
        public Object m58577b0(Map<?, ?> map) {
            C12201b.m58522g(19);
            this.f45313g.dispatchMediaKeyEvent(new KeyEvent(C12201b.m58519d(map.get("downTime")).longValue(), C12201b.m58519d(map.get("eventTime")).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("code")).intValue(), ((Integer) map.get("repeat")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scancode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
            return null;
        }

        /* renamed from: d0 */
        private void m58580d0() {
            this.f45313g.unregisterAudioDeviceCallback((AudioDeviceCallback) this.f45314h);
        }

        /* renamed from: e0 */
        private static Map<String, Object> m58582e0(AudioDeviceInfo audioDeviceInfo) {
            return C12201b.m58521f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", audioDeviceInfo.getAddress(), "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
        }

        /* access modifiers changed from: private */
        /* renamed from: f0 */
        public static List<?> m58584f0(AudioDeviceInfo[] audioDeviceInfoArr) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo e0 : audioDeviceInfoArr) {
                arrayList.add(m58582e0(e0));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public Object m58586g0() {
            C12201b.m58522g(21);
            return Integer.valueOf(this.f45313g.generateAudioSessionId());
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public Object m58588h0() {
            C12201b.m58522g(29);
            return Integer.valueOf(this.f45313g.getAllowedCapturePolicy());
        }

        /* access modifiers changed from: private */
        /* renamed from: i0 */
        public List<Map<String, Object>> m58590i0() {
            C12201b.m58522g(31);
            this.f45315i = this.f45313g.getAvailableCommunicationDevices();
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo e0 : this.f45315i) {
                arrayList.add(m58582e0(e0));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: j0 */
        public Map<String, Object> m58592j0() {
            C12201b.m58522g(31);
            return m58582e0(this.f45313g.getCommunicationDevice());
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public Object m58594k0(int i) {
            C12201b.m58522g(23);
            ArrayList arrayList = new ArrayList();
            AudioDeviceInfo[] devices = this.f45313g.getDevices(i);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                String str = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    str = audioDeviceInfo.getAddress();
                }
                arrayList.add(C12201b.m58521f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", str, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", C12201b.m58520e(audioDeviceInfo.getSampleRates()), "channelMasks", C12201b.m58520e(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", C12201b.m58520e(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", C12201b.m58520e(audioDeviceInfo.getChannelCounts()), "encodings", C12201b.m58520e(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: l0 */
        public Object m58596l0() throws IOException {
            C12201b.m58522g(28);
            ArrayList arrayList = new ArrayList();
            for (MicrophoneInfo next : this.f45313g.getMicrophones()) {
                ArrayList arrayList2 = new ArrayList();
                for (Pair next2 : next.getFrequencyResponse()) {
                    arrayList2.add(new ArrayList(Arrays.asList(new Double[]{Double.valueOf((double) ((Float) next2.first).floatValue()), Double.valueOf((double) ((Float) next2.second).floatValue())})));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Pair next3 : next.getChannelMapping()) {
                    arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{(Integer) next3.first, (Integer) next3.second})));
                }
                arrayList.add(C12201b.m58521f("description", next.getDescription(), "id", Integer.valueOf(next.getId()), "type", Integer.valueOf(next.getType()), "address", next.getAddress(), "location", Integer.valueOf(next.getLocation()), "group", Integer.valueOf(next.getGroup()), "indexInTheGroup", Integer.valueOf(next.getIndexInTheGroup()), "position", C12201b.m58518b(next.getPosition()), AdUnitActivity.EXTRA_ORIENTATION, C12201b.m58518b(next.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(next.getSensitivity()), "maxSpl", Float.valueOf(next.getMaxSpl()), "minSpl", Float.valueOf(next.getMinSpl()), "directionality", Integer.valueOf(next.getDirectionality())));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: m0 */
        public Object m58598m0() {
            return Integer.valueOf(this.f45313g.getMode());
        }

        /* access modifiers changed from: private */
        /* renamed from: n0 */
        public Object m58600n0(String str) {
            return this.f45313g.getParameters(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: o0 */
        public Object m58602o0(String str) {
            C12201b.m58522g(17);
            return this.f45313g.getProperty(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: p0 */
        public Object m58604p0() {
            return Integer.valueOf(this.f45313g.getRingerMode());
        }

        /* access modifiers changed from: private */
        /* renamed from: q0 */
        public Object m58606q0(int i) {
            return Integer.valueOf(this.f45313g.getStreamMaxVolume(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: r0 */
        public Object m58608r0(int i) {
            C12201b.m58522g(28);
            return Integer.valueOf(this.f45313g.getStreamMinVolume(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: s0 */
        public Object m58610s0(int i) {
            return Integer.valueOf(this.f45313g.getStreamVolume(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: t0 */
        public Object m58612t0(int i, int i2, int i3) {
            C12201b.m58522g(28);
            return Float.valueOf(this.f45313g.getStreamVolumeDb(i, i2, i3));
        }

        /* renamed from: u0 */
        private void m58614u0() {
            C12203a aVar = new C12203a();
            this.f45314h = aVar;
            this.f45313g.registerAudioDeviceCallback(aVar, this.f45307a);
        }

        /* access modifiers changed from: private */
        /* renamed from: v0 */
        public void m58616v0(String str, Object... objArr) {
            for (C12201b a : this.f45308b) {
                a.f45306b.mo22159c(str, new ArrayList(Arrays.asList(objArr)));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: w0 */
        public Object m58618w0() {
            return Boolean.valueOf(this.f45313g.isBluetoothScoAvailableOffCall());
        }

        /* access modifiers changed from: private */
        /* renamed from: x0 */
        public Object m58620x0() {
            return Boolean.valueOf(this.f45313g.isBluetoothScoOn());
        }

        /* access modifiers changed from: private */
        /* renamed from: z0 */
        public Object m58623z0() {
            C12201b.m58522g(29);
            return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
        }

        /* renamed from: K0 */
        public void mo36728K0(C12201b bVar) {
            this.f45308b.remove(bVar);
        }

        /* renamed from: V */
        public void mo36729V(C12201b bVar) {
            this.f45308b.add(bVar);
        }

        /* renamed from: c0 */
        public void mo36730c0() {
            m58576b();
            if (Build.VERSION.SDK_INT >= 23) {
                m58580d0();
            }
            this.f45312f = null;
            this.f45313g = null;
        }

        /* renamed from: y0 */
        public boolean mo36731y0() {
            return this.f45308b.size() == 0;
        }
    }

    public C12201b(Context context, C6539c cVar) {
        if (f45304c == null) {
            f45304c = new C12202a(context);
        }
        this.f45305a = cVar;
        this.f45306b = new C6556k(cVar, "com.ryanheise.android_audio_manager");
        f45304c.mo36729V(this);
        this.f45306b.mo22161e(this);
    }

    /* renamed from: b */
    static ArrayList<Double> m58518b(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(Double.valueOf((double) coordinate3F.x));
        arrayList.add(Double.valueOf((double) coordinate3F.y));
        arrayList.add(Double.valueOf((double) coordinate3F.z));
        return arrayList;
    }

    /* renamed from: d */
    static Long m58519d(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    /* renamed from: e */
    static ArrayList<Integer> m58520e(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: f */
    static Map<String, Object> m58521f(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            hashMap.put(objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    /* renamed from: g */
    static void m58522g(int i) {
        if (Build.VERSION.SDK_INT < i) {
            throw new RuntimeException("Requires API level " + i);
        }
    }

    /* renamed from: c */
    public void mo36727c() {
        this.f45306b.mo22161e((C6556k.C6560c) null);
        f45304c.mo36728K0(this);
        if (f45304c.mo36731y0()) {
            f45304c.mo36730c0();
            f45304c = null;
        }
        this.f45306b = null;
        this.f45305a = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        try {
            List list = (List) jVar.f31000b;
            String str = jVar.f30999a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        c = '(';
                        break;
                    }
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        c = 29;
                        break;
                    }
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        c = '*';
                        break;
                    }
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        c = 28;
                        break;
                    }
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        c = 19;
                        break;
                    }
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        c = 27;
                        break;
                    }
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        c = ')';
                        break;
                    }
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        c = 26;
                        break;
                    }
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        c = 9;
                        break;
                    }
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        c = '%';
                        break;
                    }
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        c = ' ';
                        break;
                    }
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        c = 24;
                        break;
                    }
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        c = 16;
                        break;
                    }
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        c = 11;
                        break;
                    }
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        c = 31;
                        break;
                    }
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        c = 2;
                        break;
                    }
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        c = '#';
                        break;
                    }
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        c = 25;
                        break;
                    }
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        c = 10;
                        break;
                    }
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        c = 23;
                        break;
                    }
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        c = 7;
                        break;
                    }
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        c = 5;
                        break;
                    }
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        c = 13;
                        break;
                    }
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        c = '&';
                        break;
                    }
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        c = '$';
                        break;
                    }
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        c = '!';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    dVar.success(Boolean.valueOf(f45304c.m58546L0(list)));
                    return;
                case 1:
                    dVar.success(Boolean.valueOf(f45304c.m58576b()));
                    return;
                case 2:
                    dVar.success(f45304c.m58577b0((Map) list.get(0)));
                    return;
                case 3:
                    dVar.success(f45304c.m58533E0());
                    return;
                case 4:
                    dVar.success(f45304c.m58566W(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 5:
                    dVar.success(f45304c.m58570Y(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue()));
                    return;
                case 6:
                    dVar.success(f45304c.m58568X(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 7:
                    dVar.success(f45304c.m58604p0());
                    return;
                case 8:
                    dVar.success(f45304c.m58606q0(((Integer) list.get(0)).intValue()));
                    return;
                case 9:
                    dVar.success(f45304c.m58608r0(((Integer) list.get(0)).intValue()));
                    return;
                case 10:
                    dVar.success(f45304c.m58610s0(((Integer) list.get(0)).intValue()));
                    return;
                case 11:
                    dVar.success(f45304c.m58612t0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 12:
                    dVar.success(f45304c.m58560S0(((Integer) list.get(0)).intValue()));
                    return;
                case 13:
                    dVar.success(f45304c.m58564U0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 14:
                    dVar.success(f45304c.m58531D0(((Integer) list.get(0)).intValue()));
                    return;
                case 15:
                    dVar.success(f45304c.m58590i0());
                    return;
                case 16:
                    dVar.success(Boolean.valueOf(f45304c.m58552O0((Integer) list.get(0))));
                    return;
                case 17:
                    dVar.success(f45304c.m58592j0());
                    return;
                case 18:
                    dVar.success(f45304c.m58572Z());
                    return;
                case 19:
                    dVar.success(f45304c.m58562T0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 20:
                    dVar.success(f45304c.m58529C0());
                    return;
                case 21:
                    dVar.success(f45304c.m58548M0(((Integer) list.get(0)).intValue()));
                    return;
                case 22:
                    dVar.success(f45304c.m58588h0());
                    return;
                case 23:
                    dVar.success(f45304c.m58618w0());
                    return;
                case 24:
                    dVar.success(f45304c.m58565V0());
                    return;
                case 25:
                    dVar.success(f45304c.m58567W0());
                    return;
                case 26:
                    dVar.success(f45304c.m58550N0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 27:
                    dVar.success(f45304c.m58620x0());
                    return;
                case 28:
                    dVar.success(f45304c.m58554P0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 29:
                    dVar.success(f45304c.m58525A0());
                    return;
                case 30:
                    dVar.success(f45304c.m58556Q0(((Integer) list.get(0)).intValue()));
                    return;
                case 31:
                    dVar.success(f45304c.m58598m0());
                    return;
                case ' ':
                    dVar.success(f45304c.m58527B0());
                    return;
                case '!':
                    dVar.success(f45304c.m58586g0());
                    return;
                case '\"':
                    dVar.success(f45304c.m58558R0((String) list.get(0)));
                    return;
                case '#':
                    dVar.success(f45304c.m58600n0((String) list.get(0)));
                    return;
                case '$':
                    dVar.success(f45304c.m58539H0(((Integer) list.get(0)).intValue(), (Double) list.get(1)));
                    return;
                case '%':
                    dVar.success(f45304c.m58537G0());
                    return;
                case '&':
                    dVar.success(f45304c.m58569X0());
                    return;
                case '\'':
                    dVar.success(f45304c.m58602o0((String) list.get(0)));
                    return;
                case '(':
                    dVar.success(f45304c.m58594k0(((Integer) list.get(0)).intValue()));
                    return;
                case ')':
                    dVar.success(f45304c.m58596l0());
                    return;
                case '*':
                    dVar.success(f45304c.m58623z0());
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            dVar.error("Error: " + e, (String) null, (Object) null);
        }
    }
}
