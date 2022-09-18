package com.kinikumuda.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "Users";
    public static final String KEY_COLLECTION_ADMIN = "Admin";
    public static final String KEY_ALAMAT = "Alamat";
    public static final String KEY_STATUS = "status";
    public static final String KEY_PEKERJAAN = "perkerjaan";
    public static final String KEY_NAME = "NamaLengkap";
    public static final String KEY_EMAIL = "Email";
    public static final String KEY_NOMORHANDPHONE = "NomorHandphone";
    public static final String KEY_PASSWORD = "Password";
    public static final String KEY_PREFERENCE_NAME = "SerbaSerbuAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "Image";
    public static final String KEY_PICTURE = "picture";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_MEREK_MOBIL = "MerekMobil";
    public static final String KEY_MODEL = "Model";
    public static final String KEY_NOMOR_POLISI = "NomorPolisi";
    public static final String KEY_JARAK_TEMPUH = "JarakTempuh";
    public static final String KEY_TIPE = "Tipe";
    public static final String KEY_TAHUN_KENDARAAN = "TahunKendaraan";
    public static final String KEY_WARNA = "Warna";
    public static final String KEY_LOKASI = "Lokasi";
    public static final String KEY_HARGA = "Harga";
    public static final String KEY_COLLECTION_USERS_JUAL_MOBIL_BEKAS= "UserJualMobilBekas";
    public static final String KEY_COLLECTION_ADMIN_JUAL_MOBIL_BARU= "AdminJualMobilBaru";
    public static final String KEY_USER = "user";
    public static final String KEY_UMUR = "key_umur";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSATIONS = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILITY = "availabilty";
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";


    public static HashMap<String, String> remoteMsgHeaders = null;
    public static HashMap<String, String> getRemoteMsgHeaders(){
        if (remoteMsgHeaders == null) {
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "AAAAemIPVaI:APA91bHjZAhWgzmrCPRc7yX-IHAbphmLWpraJAWOg4mRX2Zj5qU2hBBsWCw8EzVqn2xa5zLppssQLPtspgcW_IxCew57Ckn3qnerSqsTq7KzdQS-9CaQf0juNybW4WLKkhLrPBJSNGqX"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }

}
