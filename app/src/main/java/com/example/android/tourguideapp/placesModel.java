package com.example.android.tourguideapp;

import java.util.ArrayList;

public class placesModel {

    private double mLatitude;
    private double mLongitude;
    private String mPlaceAddress;
    private int mImageRecourse = NO_IMAGE;
    private String mPlaceName;
    private String mPlaceDetail;
    private static final int NO_IMAGE = -1;

    public double getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public double getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(double mLongitude) {
        this.mLongitude = mLongitude;
    }


    public placesModel(String mPlaceName, String mPlaceAddress, double mLatitude, double mLongitude) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }


    public placesModel() {

    }

    public placesModel(String mPlaceName, String mPlaceAddress, String mPlaceDetail) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mPlaceDetail = mPlaceDetail;
    }


    public placesModel(String mPlaceName, String mPlaceAddress, int mImageRecourse, String mPlaceDetail) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mImageRecourse = mImageRecourse;
        this.mPlaceDetail = mPlaceDetail;
    }

    public placesModel(String mPlaceName, String mPlaceAddress, int mImageRecourse) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mImageRecourse = mImageRecourse;
    }

    public placesModel(String mPlaceName, String mPlaceAddress) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
    }


    public String getmPlaceDetail() {
        return mPlaceDetail;
    }

    public void setmPlaceDetail(String mPlaceDetail) {
        this.mPlaceDetail = mPlaceDetail;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getmPlaceAddress() {
        return mPlaceAddress;
    }

    public void setmPlaceAddress(String mPlaceAddress) {
        this.mPlaceAddress = mPlaceAddress;
    }

    public int getmImageRecourse() {
        return mImageRecourse;
    }

    public void setmImageRecourse(int mImageRecourse) {
        this.mImageRecourse = mImageRecourse;
    }


    public boolean hasImage() {
        return mImageRecourse != NO_IMAGE;
    }


    public static ArrayList<placesModel> getHotelList() {

        ArrayList<placesModel> model = new ArrayList<>();
        model.add(new placesModel("Madina Marriott Hotel", "King Faisal Street", R.drawable.medmc_exterior,
                "يوفر فندق ماريوت المدينة خدمات نقل مجانية على مدار 24 ساعة في اليوم إلى المسجد" +
                        " النبوي الشريف الواقع على بُعد دقيقتين بالسيارة، ويضم مقهى ومرافق أعمال وخدمة الغرف على مدار 24 ساعة في اليوم.\n" +
                        "\n" +
                        "تتميز الغرف الفسيحة بأثاث خشبي كلاسيكي وأقمشة غنية وكراسي مبطنة، ويمكن توصيل الصحف إلى الغرف عند الطلب.\n" +
                        "\n" +
                        "يقع فندق ماريوت المدينة في منطقة هادئة بالمدينة المنورة، على بُعد 18 كم فقط من الأمير محمد بن عبد العزيز.\n" +
                        "\n" +
                        "يقدم مطعم العقيق الأنيق المأكولات العالمية وبوفيه إفطار غني، ويمكن للضيوف الاستمتاع بوجبات الإفطار والغداء الخفيفة في مقهى المنارة الذي يعمل على مدار 24 ساعة في اليوم.\n" +
                        "\n" +
                        "هذه المنطقة المفضلة من المدينة المنورة لدى ضيوفنا بناءً على التقييمات المستقلة.\n" +
                        "\n" +
                        "نحن نتكلم لغتك!"));

        model.add(new placesModel("Golden Tulip Al Mektan", "Al Salam Street , West Area", R.drawable.golden_tulip_al_mektan,
                "قع فندق جولدن توليب المكتان في المدينة المنورة، على بُعد 375 متر فقط سيراً على الأقدام من المسجد النبوي الشريف، وتتوفر خدمة" +
                        " الواي فاي مجاناً في المناطق العامة. كما يشمل مطعم مع خدمة الغرف على مدار 24 ساعة في اليوم ومتجر لبيع الهدايا.\n" +
                        "\n" +
                        "تتميز جميع الغرف في جولدن توليب بديكور بلمسات دافئة وأنيقة، وتشتمل كل وحدة على منطقة صغيرة للجلوس مع" +
                        " ميني بار وجهاز تلفزيون ذي شاشة مسطحة. كما يشمل الجناح غرفة معيشة ومطبخ صغير، وقد تم تجهيز الحمام بدُشّ أو حوض استحمام.\n" +
                        "\n" +
                        "يوفر فندق جولدن توليب المكتان مكتب" +
                        " استقبال يعمل على مدار 24 ساعة في اليوم، وتشتمل المرافق الأخرى المتوفرة على محلات تجارية (في الموقع) وخدمة كيّ الملابس.\n" +
                        "\n" +
                        "يقع مطار الأمير محمد بن عبد العزيز ضمن مسافة 15 دقيقة بالسيارة من فندق جولدن توليب المكتان."));

        model.add(new placesModel("Dallah Taibah Hotel ", "Abarzar street", R.drawable.dallah_taibah_hotel, "يقع فندق دلة طيبة على بعد 50 متر من المسجد النبوي والمنطقة التجارية وخيارات التسوق الواقعة في المدينة المنورة.\n" +
                "\n" +
                "توفر كل غرفة واسعة في فندق دلة طيبة تكييف هواء، وتتميز بعض الغرف بإطلالات على المسجد النبوي، كما تتميز جميع الغرف بتلفزيونات بشاشات مسطحة وصناديق ودائع آمنة، وتحتوي الحمامات على لوازم استحمام مجانية ونعال.\n" +
                "\n" +
                "يقدم المقهى في اللوبي مجموعة متنوعة من المشروبات الساخنة والعصائر الطازجة والحلويات والوجبات الخفيفة، كما يتم تقديم وجبة الإفطار في فندق دلة طيبة عند الطلب، وتتوفر خدمة الغرف أيضًا على مدار 24 ساعة في اليوم.\n" +
                "\n" +
                "يقع مسجد القبلتين ومسجد قباء على بعد 7 كم من الفندق، كما يبعد مطار الأمير محمد مسافة 25 كم."));

        model.add(new placesModel("Golden Garden Al-medina Hotel", "Saad bin. Khithamah Beside National hospital", R.drawable.golden_garden,
                "قع فندق جولدن جاردن المدينة في المدينة المنورة، وعلى بعد 6 كم من المسجد النبوي،" +
                        " ويضم غرف مكيفة مع خدمة الواي فاي المجانية وخدمة تسجيل الوصول والمغادرة السريعة، كما تضم" +
                        " جميع الغرف تلفزيون بشاشة مسطحة مع قنوات فضائية وحمام خاص، فيما يوفر مكان" +
                        " الإقامة هذا مكتب استقبال يعمل على مدار الساعة وخدمة الغرف للضيوف.\n" +
                        "\n" +
                        "تضم جميع الغرف في هذا الفندق غلاية.\n" +
                        "\n" +
                        "يقع فندق جولدن جاردن المدينة على بعد 3.1 كم من مسجد قباء و5 كم من مقبرة البقيع، ويعتبر مطار الأمير محمد بن عبد العزيز الدولي المطار الأقرب لمكان الإقامة هذا، حيث يقع على بعد 16 كم."));


        model.add(new placesModel("Coral Al Madinah Hotel  ", "Abu Ayyub Al Ansari - Bani Khidrah District",
                R.drawable.coral,
                "أقم في قلب المدينة المنورة – موقع ممتاز - اعرض الخريطة\n" +
                        "يقع فندق كورال المدينة في المدينة المنورة، وعلى بعد 80 متر من المسجد النبوي، كما يوفر خدمة الواي فاي مجاناً. ويبعد مكان الإقامة هذا مسافة 100 متر عن مقبرة البقيع. ويضم مكتب استقبال يعمل على مدار الساعة.\n" +
                        "\n" +
                        "تحتوي الوحدات في الفندق على تلفزيون بشاشة مسطحة. كما تحتوي الغرف على حمام خاص مجهز بدش، بينما توفر لك بعض الغرف منطقة جلوس وإطلالات جزئية على الحرم. فيما تشمل جميع الوحدات غلاية وخزانة ملابس.\n" +
                        "\n" +
                        "يتم تقديم بوفيه إفطار عالمي في المطعم، بينما تقدم الوجبات الخفيفة والمشروبات في اللوبي.\n" +
                        "\n" +
                        "يقع فندق كورال المدينة على بعد 800 متر من البازار القديم و2.2 كم من مزايا مول." +
                        " ويبعد مطار الأمير محمد بن عبد العزيز الدولي القريب مسافة 14 كم عن مكان الإقامة."));

        return model;
    }

    public static ArrayList<placesModel> getFoodList() {
        ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel("McDonalds", "Ghassan bin Qais al-Asadi, Friday, Medina", "شركة ماكدونالدز \u200F تأسست 15 مايو 1940، إحدى أكبر سلسلة مطاعم الوجبات السريعة في العالم. الطعام الأساسي الذي يعده هو البرجر بأنواعه وأحجامه المختلفة، بطاطس مقلية، بعض وجبات الإفطار، مشروبات غازية، حليب وحلويات، المثلجات. وحديثًا يقدم المأكولات الصحية كالسلطات."));


        return models;
    }

    public static ArrayList<placesModel> getPlacesList() {
        ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel("Al Haram", "Al haram medina", R.drawable.alharam,
                "المسجد النبوي أو الحرم النبوي " +
                        "أو مسجد النبي أحد أكبر المساجد في العالم وثاني أقدس موقع في الإسلام (بعد المسجد الحرام في مكة المكرمة)،" +
                        " وهو المسجد الذي بناه النبي محمد في المدينة المنورة بعد هجرته سنة 1 هـ الموافق 622 بجانب بيته بعد بناء مسجد قباء." +
                        " مرّ المسجد بعدّة توسعات عبر التاريخ، مروراً بعهد الخلفاء الراشدين والدولة الأموية فالعباسية والعثمانية،" +
                        " وأخيراً في عهد الدولة السعودية حيث تمت أكبر توسعة له عام 1994. ويعتبر المسجد النبوي أول مكان في شبه" +
                        " الجزيرة العربية يتم فيه الإضاءة عن طريق استخدام المصابيح الكهربائية عام 1327 هـ الموافق 1909"));

        models.add(new placesModel("Al Haram", "Al haram medina", R.drawable.msjed,
                "مسجد قِباءٍ أحد أشهر المساجد في التَّاريخ الإسلاميّ بعد المسجد" +
                        " الحرام، والمسجد النَّبويّ، والمسجد الأقصى؛ لكنّه يختلف عن هذه المساجد بأنّ الرِّحال لا تُشدُّ إليه، كما لا يُطلق عليه اسم" +
                        " حَرَمٌ لعدم ورود ذلك عن النَّبي صلى الله عليه وسلم. مسجد قِباء أوّل مسجدٍ تمّ بناؤه في الإسلام عندما هاجر النّبي صلى الله" +
                        " عليه وسلم من مكّة إلى المدينة على مشارف المدينة من النَّاحية الجنوبيّة الغربيّة، ويبعد عن مركز المسجد النَّبويّ حوالي" +
                        " أربعة كيلومتراتٍ، ولمسجد قِباءٍ مكانةٌ عظيمةٌ في التَّاريخ الإسلاميّ، حيث إنَّ بناءه كان أوّل عملٍ قام به الرَّسول الكريم فور" +
                        " وصوله المدينة- يثرب سابقاً- وشارك في عملية البِناء بنفسه؛ فكان شاهداً على ميلاد الحضارة الإسلاميّة ودولتها العظيمة.\n"));


        return models;
    }

    public static ArrayList<placesModel> getShoppingList() {
        ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel("الراشد ميغا مول المدينة المنورة", "طريق الملك عبدالله الفرعي شظاة", R.drawable.aalrashed,
                "تمنحكم مجموعة الشايع، الشركة الرائدة في مجال تجارة التجزئة والوكيل لأشهر العلامات التجارية العالمية التي تشمل أكثر من 90 علامة تجارية، تجربة فريدة للتسوق في مختلف قطاعات تجارة التجزئة ، والاستمتاع بتجربة ضيافة متميزة لدى مطاعمها ومقاهيها ، بالإضافة إلى قطاع الضيافة والفنادق وخيارات الترفيه العائلي وفق أعلى مستويات الخدمة في الشرق الأوسط وشمال افريقيا وروسيا وتركيا واوروبا وغيرها.\n" +
                        "\n" +
                        "مجموعة الشايع، هي شركة عائلية تمارس نشاطها التجاري في عدد كبير من الأسواق المحلية والعالمية، ولديها سجل ثابت من النمو والابتكارات. على مدى 35 عامًا، أثبتت الشايع نفسها كشركة رائدة في إدارة وتشغيل العلامات التجارية، وذلك باستخدام معرفتها وخبرتها الاستثنائية للتوسع في الأسواق المختلفة."));
        models.add(new placesModel("مجمع عادل الدولي", " حجير بن بيان، الجمعة", R.drawable.screenshot_2, "مجمع عادل الدولي للأزياء هو خيارك الافضل لكل انواع الفساتين و احدث انواع الموضة الرائجة، تقدّم للمرأة في المملكة العربية السعودية مجموعة مختارة من الأزياء العصرية التي تناسب جميع الأذواق فهي ساحرة و غاية في الجمال، تتكوّن تشكيلاتنا من الموديلات العصرية الأنيقة، والأزياء الرسمية، التي صُمّمت خصّيصاً لتناسب أسلوب حياة المرأة الشابة والمفعمة بالحيوية."));
        models.add(new placesModel("النور مول من المراكز العربية", " طريق الملك عبدالله الفرعي", R.drawable.alnoor, "من المولات الكبيرة في المدينة به جميع الماراكات العالمية يوجد به منطقة خاصة للطعام ومنطقة خاصة للألعاب كما يوجد به سوبر ماركت بنده\n" +
                "\n"));


        return models;
    }


}
