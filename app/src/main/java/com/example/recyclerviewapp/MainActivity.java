package com.example.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcVData;
    private PaperAdapter paperAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcVData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcVData.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcVData.addItemDecoration(itemDecoration);

        paperAdapter = new PaperAdapter(this, getListPaper());
        rcVData.setAdapter(paperAdapter);
    }

    private List<Paper> getListPaper() {
        List<Paper> list = new ArrayList<>();

        int time = 3;
        for (int i = 0; i < time; i++) {
            list.add(new Paper(
                    R.drawable.gpt,
                    "Tích hợp ChatGPT vào Google Search để tìm kiếm dễ dàng hơn",
                    "Để tối ưu hóa việc tìm kiếm trên Google, việc tích hợp ChatGPT vào Google Search là một giải pháp đáng cân nhắc. Cho ai chưa biết, ChatGPT là một công cụ trí tuệ nhân tạo được đào tạo bởi OpenAI, có khả năng tạo ra các phản hồi tự động và tự nhiên cho các câu hỏi và yêu cầu của người dùng.\n" +
                            "\n" +
                            "Trong bài viết này, chúng ta sẽ tìm hiểu cách tích hợp ChatGPT vào Google Search để đạt được kết quả tìm kiếm chính xác và đầy đủ. Còn chờ gì nữa, bạn hãy cùng Sforum bỏ túi bí kíp này thôi nào!\n" +
                            "\n" +
                            "Tóm lại, tích hợp ChatGPT vào Google Search là một công cụ hữu ích cho việc tìm kiếm thông tin. Bằng cách làm theo các bước trên, bạn đã có thể sử dụng ChatGPT trên Google Search để tìm kiếm thông tin đầy đủ và chính xác hơn. Nếu bạn có bất kỳ thắc mắc hoặc góp ý nào, hãy để lại bình luận phía dưới bài viết. Chúc bạn thành công!"));

            list.add(new Paper(
                    R.drawable.nvidia,
                    "NVIDIA GeForce RTX 4070 dự kiến ra mắt, giá tiếp tục tăng",
                    "NVIDIA GeForce RTX 4070 là sản phẩm kế tiếp thuộc dòng GPU RTX 40-series sử dụng kiến trúc Ada Lovelace đã được hãng giới thiệu vào năm ngoái. Theo như leaker uy tín Hongxing2020 đã đăng tải trên Twitter cho biết, sản phẩm mới của NVIDIA dự kiến sẽ phát hành chính thức vào ngày 13 tháng 4 năm nay.\n" +
                            "\n" +
                            "Tần số xung nhịp dự kiến sẽ rơi vào khoảng 1920MHz cho xung nhịp cơ bản và 2475MHz cho xung nhịp tối đa. Hiệu suất tính toán cơ bản được rò rỉ chỉ khoảng 30 TFLOP.\n" +
                            "\n" +
                            "Cùng với đó, NVIDIA cũng đang bắt đầu thanh lý hàng tồn kho cho những sản phẩm thuộc dòng RTX 30 FE (Founders Edition). Điều này cho thấy những tin đồn trước đó về dòng Founders Edition của RTX 40-series trở nên khả thi hơn bao giờ hết."));

            list.add(new Paper(
                    R.drawable.mivacuum,
                    "Xiaomi ra mắt robot lau nhà Xiaomi thiết kế lau kép",
                    "Xiaomi mới đây vừa ra mắt một chiếc robot hút bụi mới, có tên gọi là Xiaomi MIJIA 3S. Sản phẩm này sở hữu khá nhiều tính năng hấp dẫn, thiết kế được cải tiến và đi kèm giá bán khá phải chăng.\n" +
                            "\n" +
                            "Theo Xiaomi, robot quét và lau nhà MIJIA 3S mới sử dụng thiết kế lau kép giống như những gì có trên robot lau cửa sổ. Hai cây lau nhà hình tròn được đặt cạnh nhau ở phía trước. Sảm phẩm cũng đi kèm với một quạt hút lớn lên tới 4000Pa. Nó cũng có tính năng tránh chướng ngại vật ba chiều nên không chỉ có thể tránh chướng ngại vật ở phía trước mà còn ở phía trên và phía dưới.\n" +
                            "\n" +
                            "Thiết kế của robot hút bụi Xiaomi MIJIA 3S cũng bao gồm khả năng làm sạch dọc theo bức tường, không gian thấp và khả năng tránh rơi xuống cầu thang. Nó cũng bao gồm một đế sạc nhỏ gọn và một miếng đệm chống ẩm để cách ly với nước dư."));

            list.add(new Paper(
                    R.drawable.foxconn,
                    "Foxconn xuống tiền chuẩn bị lắp ráp AirPods cho Apple",
                    "Theo báo cáo mới của Reuters, nhà cung cấp của Apple là Foxconn sẽ lần đầu tiên giành được đơn đặt hàng sản xuất AirPods.\n" +
                            "\n" +
                            "Nhà sản xuất hợp đồng Đài Loan có kế hoạch xây dựng một nhà máy ở Ấn Độ để sản xuất các tai nghe của Apple trong thời gian tới.\n" +
                            "\n" +
                            "Theo các nguồn tin của báo cáo, Foxconn sẽ đầu tư hơn 200 triệu USD vào một nhà máy lắp ráp AirPods mới ở bang Telangana, miền nam Ấn Độ. Việc xây dựng cơ sở dự kiến \u200B\u200Bsẽ bắt đầu vào nửa cuối năm nay và bắt đầu sản xuất sớm nhất vào cuối năm 2024."));

            list.add(new Paper(
                    R.drawable.honorwatch,
                    "Smartwatch HONOR sạc 2 giờ dùng 2 tuần",
                    "Tín đồ của đồng hồ thông minh chắc chắn không thể bỏ qua smartwatch HONOR đang giảm tiền triệu. Sản phẩm mang phong cách thiết kế thanh lịch, tinh tế, hỗ trợ nhiều tính năng theo dõi sức khỏe, cùng nhiều tiện ích đi kèm đặc biệt là thời lượng pin dùng siêu lâu. \n" +
                            "\n" +
                            "HONOR Watch GS3 45.9mm được chế tác từ các vật liệu bền bỉ và khung viền thép không gỉ, gia tăng sự bảo vệ, hạn chế hư hỏng do va chạm trong quá trình sử dụng. Màn hình AMOLED sắc nét 1.43 inch cung cấp không gian hiển thị rộng rãi. Hỗ trợ GPS băng tần kép hiện đại mang lại khả năng định vị, theo dõi vị trí với khả năng chính xác cao.\n" +
                            "\n" +
                            "Đồng hồ tích hợp hơn 100 chế độ thể thao, bao gồm 85 chế độ tập luyện được thiết kế riêng cùng nhiều tiện ích đi kèm. Với chuẩn kháng nước 5 ATM, viên pin 451 mAh, đồng hồ Honor GS3 cung cấp thời lượng sử dụng lên đến 14 ngày khi sử dụng ở chế độ cơ bản hoặc kéo dài 30 giờ ở chế độ GPS, giúp những chuyến công tác, du lịch hay tập luyện của bạn diễn ra hoàn hảo hơn."));

            list.add(new Paper(
                    R.drawable.samsungchip,
                    "Samsung xây dựng nhà máy sản xuất chip lớn nhất thế giới",
                    "Samsung mới đây đã công bố kế hoạch đầu tư khoản tiền khổng lồ 230 tỷ USD (khoảng 5.4 triệu tỷ đồng) trong hai thập kỷ tới để xây dựng nhà máy sản xuất chip lớn nhất thế giới tại Hàn Quốc.\n" +
                            "\n" +
                            "Động thái mới của Samsung nhằm thúc đẩy ngành công nghiệp chip của Hàn Quốc, đồng thời mở rộng các khoản giảm thuế và hỗ trợ cho các lĩnh vực công nghệ cao như chip, màn hình và pin.\n" +
                            "\n" +
                            "Kế hoạch đầu tư của Samsung cũng bao gồm một số nhánh khác, gồm Samsung Display, Samsung SDI và Samsung Electro-Mechanics. Các công ty này có kế hoạch đầu tư 60.1 nghìn tỷ won (khoảng 1.1 triệu tỷ đồng) trong 10 năm tới vào các khu vực bên ngoài khu vực đô thị Seoul để phát triển công nghệ đóng gói, màn hình và pin, giúp đa dạng hóa cơ sở sản xuất công nghệ của Hàn Quốc và mở rộng phạm vi hoạt động ra ngoài Seoul."));

            list.add(new Paper(
                    R.drawable.chip,
                    "Qualcomm tổ chức ra mắt Snapdragon 8 Gen 1 ngày 20/5 ",
                    "Mới đây, Qualcomm đã xác nhận rằng công ty sẽ tổ chức một sự kiện ra mắt sản phẩm mới vào ngày 20/5 tại Trung Quốc. \n" +
                            "\n" +
                            "Mặc dù thông tin chi tiết về sự kiện này vẫn chưa được tiết lộ, nhưng công ty dự kiến \u200B\u200Bsẽ công bố bộ vi xử lý Qualcomm Snapdragon mới của mình. Tiêu điểm một trong số đó chính là chip Snapdragon 8 Gen 1.\n" +
                            "\n" +
                            "Ngoài ra, các rò rỉ trước đây đã chỉ ra rằng Snapdragon 8 Gen 1 Plus sẽ có cấu hình lõi 1 + 3 + 4, bao gồm lõi chính Cortex X2 với tần số 2.99 GHz. Chip xử lý này cũng được cho là đi kèm với ba lõi Cortex-A710 và bốn lõi Cortex-A510."));
        }

        return list;

    }
}