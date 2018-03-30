import android.widget.BaseAdapter;

public class RepertoireAdapter extends BaseAdapter {
  
  
  public Object getItem(int position) {
    for (int i =0; i<liste.size();i++){
		if(i == position){
			return ItemEvent;
		}
	}
  }

  public long getItemId(int position) {
    for (int i=0; liste.size(); i++){
		if(i==position){
			return ItemEvent.id;
		}
	}
  }

 
public View getView(int r, View convertView, ViewGroup parent) {
     ViewHolder holder = null;
  if(convertView == null) {
    convertView  = mInflater.inflate(R.layout.item, null);
    			
    holder = new ViewHolder();
    holder.mTitre = (TextView) convertView.findViewById(R.id.titre);
    holder.mPhoto = (ImageView) convertView.findViewById(R.id.photo);
    			
    convertView.setTag(holder);
  } else {
    holder = (ViewHolder)convertView.getTag();
  }
  Champignon c = (Champignon)getItem(r);
  if(c != null) {
    holder.mNom.setText(c.getTitre());
  }
  return convertView;
}

static class ViewHolder {
  public TextView mTitre;
  public ImageView mPhoto;
}

