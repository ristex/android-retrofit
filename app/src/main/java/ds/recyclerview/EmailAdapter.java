package ds.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder> {

    private List<Email> emails;
    private int itemLayout = R.layout.item_email;

    public EmailAdapter(List<Email> emails) {
        this.emails = emails;
    }

    @NonNull
    @Override
    public EmailAdapter.EmailViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View itemView  = LayoutInflater.from(context).inflate(itemLayout, viewGroup, false);
        return new EmailViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailAdapter.EmailViewHolder viewHolder, int position) {
        viewHolder.bind(emails.get(position));
    }

    @Override
    public int getItemCount() {
        if (emails == null) {
            return 0;
        }
        return emails.size();
    }

    class EmailViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView sender;
        private TextView subject;
        private TextView message;

        public EmailViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.email_image);
            sender = itemView.findViewById(R.id.email_sender);
            subject = itemView.findViewById(R.id.email_subject);
            message = itemView.findViewById(R.id.email_message);
        }

        public void bind(Email email) {
            image.setImageResource(email.getImage());
            sender.setText(email.getSender());
            subject.setText(email.getEmail());
            message.setText(email.getMessage());
        }
    }
}

