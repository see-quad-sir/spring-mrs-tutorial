package mrs.domain.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

import java.io.Serializable;

public class ReservableRoom implements Serializable {
    @EmbeddedId
    private ReservableRoomId reservableRoomId;

    @ManyToOne
    @JoinColumn(name = "room_id", insertable = false, updatable = false)
    @MapsId("roomId")
    private MeetingRoom meetingRoom;

    public ReservableRoom(ReservableRoomId reservableRoomId) {
        this.reservableRoomId = reservableRoomId;
    }

    public ReservableRoom() {}

    public ReservableRoomId getReservableRoomId() {
        return reservableRoomId;
    }

    public void setReservableRoomId(ReservableRoomId reservableRoomId) {
        this.reservableRoomId = reservableRoomId;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }
}
