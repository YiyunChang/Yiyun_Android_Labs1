package algonquin.cst2335.yiyun;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import algonquin.cst2335.yiyun.ChatMessage;
import algonquin.cst2335.yiyun.ChatMessage;

public class ChatRoomViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChatMessage>> messages = new MutableLiveData< >(null);
}