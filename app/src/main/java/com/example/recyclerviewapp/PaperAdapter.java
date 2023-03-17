package com.example.recyclerviewapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class PaperAdapter extends RecyclerView.Adapter<PaperAdapter.PaperViewHolder> {

    private List<Paper> mListPaper;
    private Context mContext;

    public PaperAdapter(Context context,List<Paper> mListPaper) {
        this.mListPaper = mListPaper;
        this.mContext = context;
    }

    @NonNull
    @Override
    public PaperViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_paper,viewGroup,false);
        return new PaperViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaperViewHolder paperViewHolder, int i) {

       final Paper paper = mListPaper.get(i);
        if(paper == null) {
            return;
        }
        paperViewHolder.imgAvatar.setImageResource(paper.getResourceId());
        paperViewHolder.txtTopic.setText(paper.getTopic());
        paperViewHolder.txtDetail.setText(paper.getDetail());

        paperViewHolder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGotoDetail(paper);
            }
        });
    }
    private void onClickGotoDetail(Paper paper) {
        Intent intent = new Intent(mContext,DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_paper",paper);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if(mListPaper != null) {
            return mListPaper.size();
        }
        return 0;
    }

    public class PaperViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgAvatar;
        private TextView txtTopic;
        private TextView txtDetail;
        private RelativeLayout layoutItem;

        public PaperViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            txtTopic = itemView.findViewById(R.id.txt_topic);
            txtDetail = itemView.findViewById(R.id.txt_detail);
        }
    }
}
