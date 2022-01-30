class Event extends Task {
  private String at;

  public Event(String name, String at) {
    super(name);
    this.at = at;
  }

  @Override
  Type type() {
    return Type.EVENT;
  }

  @Override
  String toSave() {
    int doneBit = isDone ? 1 : 0;
    return String.format("E,.,%d,.,%s,.,%s\n", doneBit, name, at);
  }

  @Override
  public String toString() {
    return String.format("[E]%s (at: %s)", super.toString(), this.at);
  }
}
