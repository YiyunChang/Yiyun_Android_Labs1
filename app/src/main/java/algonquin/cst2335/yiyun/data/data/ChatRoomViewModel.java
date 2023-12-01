package algonquin.cst2335.yiyun.data.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
public class ChatRoomViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChatMessage>> messages = new MutableLiveData< >(null);

    public MutableLiveData<ChatMessage> selectedMessage = new MutableLiveData< >();
}